package com.dongba.client;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import com.dongba.model.Character;

public class LineageClient {
	
	private Socket socket;
	private MessageTransporter mt;
	
	public LineageClient(String host, int port, String accountId) throws UnknownHostException, IOException {
		this.socket = new Socket(host, port);
		this.mt = new MessageTransporter(socket, accountId);
	}
	
	public void checkInCharacter(Character c) {
		try {
			start(c);
		} catch (IOException e) {
			System.out.println("failed to check in character by name " + c.getName());
		}
	}

	private void start(Character c) throws IOException {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		new SessionManager(mt, c);
		new ServerMessageReciever(mt).start();
		new ChattingClient(mt).start();
		new MotionClient(mt).start();
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) throws UnknownHostException, IOException {
		String host = "localhost";
		int port = 1500;
		String accountId = "dongba";
		LineageClient lineageClient = new LineageClient(host, port, accountId);
		String cId = "dongba";
		String cName = "dongba";
		Character c = new Character(cId, cName, 0, 0);
		lineageClient.checkInCharacter(c);
	}

}
