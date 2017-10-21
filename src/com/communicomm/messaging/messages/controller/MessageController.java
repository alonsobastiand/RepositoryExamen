package com.communicomm.messaging.messages.controller;

import java.util.ArrayList;
import java.util.List;

import com.communicom.messaging.messages.*;
import com.communicom.messaging.messages.factory.FactoryMessages;

public class MessageController implements IMessageController {

	private static MessageController singleMessageController;
	private List<IMessage> messages;

	private MessageController() {
		this.messages = new ArrayList<>();
	}

	public static MessageController getController() {
		if(singleMessageController == null) {
			synchronized (MessageController.class) {
				if(singleMessageController == null) {
					singleMessageController = new MessageController();
				}
			}
		}
		return singleMessageController;
	}

	@Override
	public void sendMessage(int messageOption) {
		messages.add(FactoryMessages.createMessage(MessageType.values()[messageOption]));
	}

	@Override
	public void listMessage() {
		for (IMessage message: messages) {
			System.out.println(message.toString());
		}
	}

}
