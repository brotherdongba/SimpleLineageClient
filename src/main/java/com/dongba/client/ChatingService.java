package com.dongba.client;

import java.io.IOException;
import java.util.Scanner;

public class ChatingService extends Thread {

	private MessageTransporter mt;

	public ChatingService(MessageTransporter mt) {
		this.mt = mt;
	}
	
	public void run() {
		Scanner scanner = new Scanner(System.in);
		try {
			while (true) {
				System.out.print("input message > ");
				String inputString = scanner.nextLine();
				mt.send(inputString);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
