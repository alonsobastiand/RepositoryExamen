package com.communicom.messaging.messages;

import com.communicom.messaging.messages.signals.SignalType;

public class SetWaitForSignalResponse extends Message implements IMessage {

	private SignalType signal;
	private String signalExpectedValue;
	private String signalReceivedValue;
	
	public SetWaitForSignalResponse(MessageType messageType) {
		super(messageType);
		this.messageNumber = 4;
	}

	public SignalType getSignal() {
		return signal;
	}

	public void setSignal(SignalType signal) {
		this.signal = signal;
	}

	public String getSignalExpectedValue() {
		return signalExpectedValue;
	}

	public void signalExpectedValue(String signalExpectedValue) {
		this.signalExpectedValue = signalExpectedValue;
	}

	public String getSignalReceivedValue() {
		return signalReceivedValue;
	}

	public void setSignalReceivedValue(String signalReceivedValue) {
		this.signalReceivedValue = signalReceivedValue;
	}

    @Override
    public String toString() {
        return "SetWaitForSignalResponse: " +
                "name: '" + name + '\'' +
                ", messageNumber: " + messageNumber +
                ", sourceAddress: '" + sourceAddress + '\'' +
                ", targetAddress: '" + targetAddress + '\'' +
                ", emisionTime: " + emisionTime +
                ", messageType: " + messageType +
                ", signal: " + signal +
                ", signalExpectedValue: '" + signalExpectedValue + '\'' +
                ", signalReceivedValue: '" + signalReceivedValue + '\'';
    }
}
