package com.dongba.client;

import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.dongba.dto.CharacterMotion;

public class MotionClient extends Thread {
	
	private MessageTransporter mt;
	private JFrame frame;

	public MotionClient(MessageTransporter mt) {
		this.mt = mt;
		this.frame = new JFrame("input motion");
	}
	
	public void run() {
		try {
			while (true) {
				String motion = JOptionPane.showInputDialog(frame, "input character motion.");
				CharacterMotion cm = parseMotion(motion);
				if (cm == null) {
					System.out.println("wrong motion");
					continue;
				}
				mt.send(cm);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private CharacterMotion parseMotion(String motion) {
		String[] split = motion.split(" ");
		if (split.length != 2) {
			return null;
		}
		return new CharacterMotion(mt.getAccountId(), split[0], Integer.parseInt(split[1]));
	}

}
