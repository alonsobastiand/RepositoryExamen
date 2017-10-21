package com.communicomm.messaging.simulator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.communicomm.messaging.messages.controller.MessageController;

public class MessagingSimulator {

    private static final int EXIT_NUM = 3;
    private static final int exitOptionMessageMenu = 7;
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static MessageController messageController = MessageController.getController();
	
	public static void main(String[] args) throws Exception{
        int option;

        do {
            printOptions();
            option = getAction();
            processOption(option);
        } while (option != EXIT_NUM);
	}

	private static void printOptions() {
		System.out.println("MESSAGING SIMULATOR V1.0");
		System.out.println("1. Simulate Message");
		System.out.println("2. List simulated messages");
		System.out.println("3. Exit");
	}

	private static int getAction() {
        try {
            return Integer.parseInt(br.readLine());
        } catch (IOException | NumberFormatException e) {
            return -1;
        }
    }
	

	private static void processOption(int option) {
		switch (option) {
            case 1:
                sendMessagetoController();
                break;
            case 2:
                messageController.listMessage();
                break;
            case 3:
                break;
            default:
                System.out.println("Invalid option");
                break;
        }

	}

	private static void sendMessagetoController() {
	    int option;
        int messageOption;

        do {
            option = askForOptions();
            messageOption = option-1;
            try {
                messageController.sendMessage(messageOption);
            } catch (ArrayIndexOutOfBoundsException ex) {
                switch (option) {
                    case exitOptionMessageMenu:
                        break;
                    default:
                        System.out.println("Invalid message option");
                        break;
                }
            }
        } while (option != exitOptionMessageMenu);

    }

	private static int askForOptions() {
		printMessageOption();
        try {
            return Integer.parseInt(br.readLine());
        } catch (IOException | NumberFormatException e) {
            return -1;
        }
    }

    private static void printMessageOption() {
        System.out.println("1. Ping Server Request");
        System.out.println("2. Ping Server Response");
        System.out.println("3. Set Wait For Signal Request");
        System.out.println("4. Set Wait For Signal Response");
        System.out.println("5. Set Bootstrap Operation Request");
        System.out.println("6. Set Bootstrap Operation Response");
        System.out.println("7. Exit");
    }

}
