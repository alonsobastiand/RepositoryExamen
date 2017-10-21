package com.communicom.messaging.messages.factory;

import com.communicom.messaging.messages.*;

public class FactoryMessages {

    public static IMessage createMessage(MessageType messageType) {

        IMessage message;

        switch (messageType) {
            case PING_SERVER_REQUEST:
                message = new PingServerRequest(messageType);
                return message;
            case PING_SERVER_RESPONSE:
                message = new PingServerResponse(messageType);
                return message;
            case SET_WAIT_fOR_SIGNAL_REQUEST:
                message = new SetWaitForSignalRequest(messageType);
                return message;
            case SET_WAIT_FOR_SIGNAL_RESPONSE:
                message = new SetWaitForSignalResponse(messageType);
                return message;
            case BOOTSTRAP_OPERATION_REQUEST:
                message = new BootstrapOperationRequest(messageType);
                return message;
            case BOOTSTRAP_OPERATION_RESPONSE:
                message = new BootstrapOperationResponse(messageType, false);
                return message;
            default:
                return null;
        }

    }

}
