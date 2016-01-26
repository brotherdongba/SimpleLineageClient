package com.dongba.client;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class MessageTransporter {
	
	private Socket socket;
	private String accountId;

	public MessageTransporter(Socket socket, String accountId) {
		this.socket = socket;
		this.accountId = accountId;
	}
	
	public void send(Object message) throws IOException {
		ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
		out.writeObject(message);
		out.flush();
	}
	
	public Object receive() throws IOException, ClassNotFoundException {
		ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
		return in.readObject();
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

}
