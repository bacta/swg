package com.ocdsoft.bacta.swg.server.game.message.object;

import com.ocdsoft.bacta.engine.utils.BufferUtil;
import com.ocdsoft.bacta.soe.message.GameNetworkMessage;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.nio.ByteBuffer;

@Getter
@AllArgsConstructor
public final class ObjControllerMessage extends GameNetworkMessage {
    private final int flags;
    private final int messageType;
    private final long actorNetworkId;
    private final float value;

    @Setter
    private MessageQueueData data;

    public ObjControllerMessage(final ByteBuffer buffer) {
        this.flags = buffer.getInt();
        this.messageType = buffer.getInt();
        this.actorNetworkId = buffer.getLong();
        this.value = buffer.getFloat();

        //NOTICE: MessageQueueData is handled by ObjControllerMessageSerializer
    }

    @Override
    public void writeToBuffer(final ByteBuffer buffer) {
        BufferUtil.put(buffer, flags);
        BufferUtil.put(buffer, messageType);
        BufferUtil.put(buffer, actorNetworkId);
        BufferUtil.put(buffer, value);

        if (data != null)
            BufferUtil.put(buffer, data);
    }
}