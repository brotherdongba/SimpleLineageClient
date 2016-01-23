package com.dongba.client;

import java.io.IOException;

public class ServerMessageReciever extends Thread {
	
	private MessageTransporter mt;

	public ServerMessageReciever(MessageTransporter messageTransporter) throws IOException {
		this.mt = messageTransporter;
	}
	
	public void run() {
		try {
			while (true) {
				Object msg = mt.receive();
				System.out.println("received message : " + msg.toString());
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
