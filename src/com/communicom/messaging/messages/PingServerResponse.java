package com.communicom.messaging.messages;

public class PingServerResponse extends Message implements IMessage {

    public PingServerResponse(MessageType messageType) {
        super(messageType);
    }

}
