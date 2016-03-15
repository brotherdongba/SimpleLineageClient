package com.dongba.client;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class LineageClient {
	
	private Socket socket;
	private MessageTransporter mt;
	
	public LineageClient(String host, int port, String accountId) throws UnknownHostException, IOException {
		this.socket = new Socket(host, port);
		this.mt = new MessageTransporter(socket, accountId);
	}
	
	public void checkInCharacter(String cName) {
		try {
			start(cName);
		} catch (IOException e) {
			System.out.println("failed to check in character by name " + cName);
		}
	}

	private void start(String cName) throws IOException {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		new SessionManager(mt, cName);
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
		String cName = "dongba";
		lineageClient.checkInCharacter(cName);
	}

}
