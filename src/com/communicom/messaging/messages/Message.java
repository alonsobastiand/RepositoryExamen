package com.communicom.messaging.messages;

import com.communicom.messaging.messages.signals.SignalType;

import java.time.LocalDateTime;

abstract class Message {

    protected String name;
    protected int messageNumber;
    protected String sourceAddress;
    protected String targetAddress;
    protected LocalDateTime emisionTime;
    protected MessageType messageType;

    Message(MessageType messageType) {
        this.name = "";
        this.messageNumber = 2;
        this.sourceAddress = "";
        this.targetAddress = "";
        this.emisionTime = LocalDateTime.now();
        this.messageType = messageType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMessageNumber() {
        return messageNumber;
    }

    public void setMessageNumber(int messageNumber) {
        this.messageNumber = messageNumber;
    }

    public String getSourceAddress() {
        return sourceAddress;
    }

    public void setSourceAddress(String sourceAddress) {
        this.sourceAddress = sourceAddress;
    }

    public String getTargetAddress() {
        return targetAddress;
    }

    public void setTargetAddress(String targetAddress) {
        this.targetAddress = targetAddress;
    }

    public LocalDateTime getEmisionTime() {
        return emisionTime;
    }

    public void setEmisionTime(LocalDateTime emisionTime) {
        this.emisionTime = emisionTime;
    }

    public MessageType getMessageType() {
        return messageType;
    }

    @Override
    public String toString() {
        return "Message: " +
                "Name: '" + name + '\'' +
                ", Message number: " + messageNumber +
                ", Source address: '" + sourceAddress + '\'' +
                ", Target address: '" + targetAddress + '\'' +
                ", Emision time: " + emisionTime +
                ", Message type: " + messageType;
    }
}
