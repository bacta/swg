package com.ocdsoft.bacta.swg.archive.delta.set;

import com.ocdsoft.bacta.engine.buffer.ByteBufferWritable;
import com.ocdsoft.bacta.engine.utils.BufferUtil;
import com.ocdsoft.bacta.swg.archive.delta.AutoDeltaContainer;
import gnu.trove.set.TLongSet;
import gnu.trove.set.hash.TLongHashSet;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public class AutoDeltaLongSet extends AutoDeltaContainer {
    private transient final List<Command> commands;
    private final TLongSet set;
    private transient int baselineCommandCount;

    public AutoDeltaLongSet() {
        this.commands = new ArrayList<>(5);
        this.set = new TLongHashSet();
        this.baselineCommandCount = 0;
    }

    public TLongSet get() {
        return set;
    }

    public int size() {
        return set.size();
    }

    public boolean isEmpty() {
        return set.isEmpty();
    }

    public boolean contains(final long value) {
        return set.contains(value);
    }

    public void clear() {
        if (!isEmpty()) {
            final Command command = new Command(Command.CLEAR, 0);
            commands.add(command);
            ++baselineCommandCount;
            set.forEach(value -> {
                erase(value);
                return true;
            });
            set.clear();
            touch();
            onChanged();
        }
    }

    public void erase(final long value) {
        if (set.contains(value)) {
            final Command command = new Command(Command.ERASE, value);
            commands.add(command);
            ++baselineCommandCount;
            set.remove(value);
            touch();
            onErase(value);
            onChanged();
        }
    }

    public void insert(final long value) {
        if (set.add(value)) {
            final Command command = new Command(Command.INSERT, value);
            commands.add(command);
            ++baselineCommandCount;
            touch();
            onInsert(value);
            onChanged();
        }
    }

    @Override
    public boolean isDirty() {
        return commands.size() > 0;
    }

    @Override
    public void clearDelta() {
        commands.clear();
    }

    @Override
    public void pack(ByteBuffer buffer) {
        buffer.putInt(set.size());
        buffer.putInt(baselineCommandCount);

        set.forEach(value -> {
            BufferUtil.put(buffer, value);
            return true;
        });
    }

    @Override
    public void packDelta(ByteBuffer buffer) {
        buffer.putInt(commands.size());
        buffer.putInt(baselineCommandCount);

        for (final Command command : commands)
            command.writeToBuffer(buffer);

        clearDelta();
    }

    @Override
    public void unpackDelta(ByteBuffer buffer) {
        int skipCount;
        final int commandCount = buffer.getInt();
        final int targetBaselineCommandCount = buffer.getInt();

        // if (commandCount+baselineCommandCount) < targetBaselineCommandCount, it
        // means that we have missed some changes and are behind; when this happens,
        // catch up by applying all the deltas that came in, and set
        // baselineCommandCount to targetBaselineCommandCount
        if ((commandCount + baselineCommandCount) > targetBaselineCommandCount)
            skipCount = commandCount + baselineCommandCount - targetBaselineCommandCount;
        else
            skipCount = 0;

        if (skipCount > commandCount)
            skipCount = commandCount;

        int i;
        for (i = 0; i < skipCount; ++i) {
            final byte cmd = buffer.get();

            if (cmd != Command.CLEAR)
                buffer.getLong();
        }

        for (; i < commandCount; ++i) {
            final Command command = new Command(buffer);

            switch (command.cmd) {
                case Command.ERASE:
                    erase(command.value);
                    break;
                case Command.INSERT:
                    insert(command.value);
                    break;
                case Command.CLEAR:
                    clear();
                    break;
            }
        }

        // if we are behind, catch up
        if (baselineCommandCount < targetBaselineCommandCount)
            baselineCommandCount = targetBaselineCommandCount;
    }

    @Override
    public void unpack(ByteBuffer buffer) {
        set.clear();
        clearDelta();

        final int commandCount = buffer.getInt();
        baselineCommandCount = buffer.getInt();

        for (int i = 0; i < commandCount; ++i) {
            final long value = buffer.getLong();
            set.add(value);
        }

        onChanged();
    }

    private void onChanged() {
        //implement on changed callback
    }

    private void onErase(final long value) {
        //implement on erase callback
    }

    private void onInsert(final long value) {
        //implement on insert callback
    }


    public final class Command implements ByteBufferWritable {
        private static final byte ERASE = 0x00;
        private static final byte INSERT = 0x01;
        private static final byte CLEAR = 0x02;

        public final byte cmd;
        public final long value;

        public Command(final byte cmd, final long value) {
            this.cmd = cmd;
            this.value = value;
        }

        public Command(final ByteBuffer buffer) {
            cmd = buffer.get();

            switch (cmd) {
                case ERASE:
                case INSERT:
                    value = buffer.getLong();
                    break;
                case CLEAR:
                    value = 0;
                    break;
                default:
                    value = 0;
                    assert false : "Unknown command type.";
            }
        }

        @Override
        public void writeToBuffer(ByteBuffer buffer) {
            buffer.put(cmd);

            switch (cmd) {
                case ERASE:
                case INSERT:
                    BufferUtil.put(buffer, value);
                    break;
                case CLEAR:
                    break;
                default:
                    assert false : "Unknown command type.";
            }
        }
    }
}
