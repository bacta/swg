package com.ocdsoft.bacta.swg.server.game.message.object;

import com.ocdsoft.bacta.engine.utils.BufferUtil;
import com.ocdsoft.bacta.swg.server.game.controller.object.GameControllerMessage;
import com.ocdsoft.bacta.swg.shared.math.Transform;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.nio.ByteBuffer;

/**
 * Created by crush on 5/29/2016.
 */
@Getter
@AllArgsConstructor
@GameControllerMessage(GameControllerMessageType.NET_UPDATE_TRANSFORM)
public final class MessageQueueDataTransform implements MessageQueueData {
    private final int syncStamp;
    private final int sequenceNumber;
    private final Transform transform;
    private final float speed;
    private final float lookAtYaw;
    private final boolean useLookAtYaw;

    public MessageQueueDataTransform(final ByteBuffer buffer) {
        syncStamp = buffer.getInt();
        sequenceNumber = buffer.getInt();
        transform = new Transform(buffer);
        speed = buffer.getFloat();
        lookAtYaw = buffer.getFloat();
        useLookAtYaw = BufferUtil.getBoolean(buffer);
    }

    @Override
    public void writeToBuffer(final ByteBuffer buffer) {
        BufferUtil.put(buffer, syncStamp);
        BufferUtil.put(buffer, sequenceNumber);
        BufferUtil.put(buffer, transform);
        BufferUtil.put(buffer, speed);
        BufferUtil.put(buffer, lookAtYaw);
        BufferUtil.put(buffer, useLookAtYaw);
    }
}
