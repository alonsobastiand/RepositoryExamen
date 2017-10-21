package com.communicom.messaging.messages;

import com.communicom.messaging.messages.signals.SignalType;

public class SetWaitForSignalRequest extends Message implements IMessage {

	private SignalType signal;
	private String signalValue;
	
	public SetWaitForSignalRequest(MessageType messageType) {
		super(messageType);
		this.messageNumber = 3;
	}

	public SignalType getSignal() {
		return signal;
	}

	public void setSignal(SignalType signal) {
		this.signal = signal;
	}

	public String getSignalValue() {
		return signalValue;
	}

	public void setSignalValue(String signalValue) {
		this.signalValue = signalValue;
	}

	@Override
	public String toString() {
		return "SetWaitForSignalRequest: " +
				"name: '" + name + '\'' +
				", messageNumber: " + messageNumber +
				", sourceAddress: '" + sourceAddress + '\'' +
				", targetAddress: '" + targetAddress + '\'' +
				", emisionTime: " + emisionTime +
				", messageType: " + messageType +
				", signal: " + signal +
				", signalValue: '" + signalValue + '\'';
	}
}
