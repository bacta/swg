package com.ocdsoft.bacta.soe.message;

public final class Terminate extends SoeMessage {

	public Terminate(int connectionId, TerminateReason reason) {
		super(UdpPacketType.cUdpPacketTerminate);
				
		buffer.putInt(connectionId);
        reason.writeToBuffer(buffer);
	}
}
