package com.ocdsoft.bacta.quasar.messages;

import co.paralleluniverse.actors.ActorRef;
import co.paralleluniverse.actors.behaviors.RequestMessage;
import lombok.Getter;

/**
 * Created by crush on 3/31/2017.
 */
@Getter
public final class SetLongPropertyRequestMessage extends RequestMessage<SetLongPropertyRequestMessage> {
    private final String propertyName;
    private final long value;

    public SetLongPropertyRequestMessage(ActorRef<?> from, String propertyName, long value) {
        super(from);
        this.propertyName = propertyName;
        this.value = value;
    }
}
