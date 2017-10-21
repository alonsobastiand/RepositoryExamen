package com.communicom.messaging.messages;

public class BootstrapOperationResponse extends BootstrapOperation {

    private boolean result;
    private String errorMessage;


    public BootstrapOperationResponse(MessageType messageType, boolean result) {
        super(messageType);
        this.result = result;
        changeErrorState();
    }

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
        changeErrorState();
    }

    private void changeErrorState() {
        if (!this.result) {
            errorMessage = "";
        } else {
            errorMessage = "Error";
        }
    }

    @Override
    public String toString() {
        return "BootstrapOperationResponse: " +
                "Name: '" + name + '\'' +
                ", Message number: " + messageNumber +
                ", Source address: '" + sourceAddress + '\'' +
                ", Target address: '" + targetAddress + '\'' +
                ", Emision time: " + emisionTime +
                ", Message type: " + messageType +
                ", Result: " + result +
                ", Message Error: '" + errorMessage + '\'';
    }
}
