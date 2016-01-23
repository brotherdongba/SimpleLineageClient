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
		start();
	}

	private void start() throws IOException {
		new ServerMessageReciever(mt).start();
		new ChatingService(mt).start();
		new MotionService(mt).start();
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) throws UnknownHostException, IOException {
		String host = "localhost";
		int port = 1500;
		String accountId = "dongba";
		LineageClient lineageClient = new LineageClient(host, port, accountId);
	}

}
