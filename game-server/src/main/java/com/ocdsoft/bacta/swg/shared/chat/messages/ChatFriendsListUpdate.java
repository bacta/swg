package com.ocdsoft.bacta.swg.shared.chat.messages;

import com.ocdsoft.bacta.engine.utils.BufferUtil;
import com.ocdsoft.bacta.soe.message.GameNetworkMessage;
import com.ocdsoft.bacta.soe.message.Priority;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.nio.ByteBuffer;

/**
 * Created by crush on 5/20/2016.
 */
@Getter
@Priority(0x05)
@AllArgsConstructor
public final class ChatFriendsListUpdate extends GameNetworkMessage {
    private final ChatAvatarId characterId;
    private final boolean online;

    public ChatFriendsListUpdate(final ByteBuffer buffer) {
        this.characterId = new ChatAvatarId(buffer);
        this.online = BufferUtil.getBoolean(buffer);
    }

    @Override
    public void writeToBuffer(final ByteBuffer buffer) {
        BufferUtil.put(buffer, characterId);
        BufferUtil.put(buffer, online);
    }
}