package com.communicom.messaging.messages;

abstract class BootstrapOperation extends Message implements IMessage  {

    private String version;

    BootstrapOperation(MessageType messageType) {
        super(messageType);
        version = "";
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "BootstrapOperation: " +
                "Name: '" + name + '\'' +
                ", Message number: " + messageNumber +
                ", Source address: '" + sourceAddress + '\'' +
                ", Target address: '" + targetAddress + '\'' +
                ", Emision time: " + emisionTime +
                ", Message type: " + messageType +
                ", Version: '" + version + '\'';
    }
}
