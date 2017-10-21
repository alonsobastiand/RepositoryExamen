package com.communicom.messaging.messages;

public class PingServerRequest extends Message implements IMessage {

	public PingServerRequest(MessageType messageType){
		super(messageType);
	}

}
