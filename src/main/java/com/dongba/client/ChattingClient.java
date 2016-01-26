package com.dongba.client;

import java.io.IOException;
import java.util.Scanner;

import com.dongba.model.ChatMessage;

public class ChattingClient extends Thread {

	private MessageTransporter mt;

	public ChattingClient(MessageTransporter mt) {
		this.mt = mt;
	}
	
	public void run() {
		Scanner scanner = new Scanner(System.in);
		try {
			while (true) {
				System.out.print("input message > ");
				String inputString = scanner.nextLine();
				if (inputString == null || inputString.isEmpty()) {
					continue;
				}
				ChatMessage chatMessage = new ChatMessage(mt.getAccountId(), inputString);
				mt.send(chatMessage);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
