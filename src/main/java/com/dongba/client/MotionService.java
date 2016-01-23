package com.dongba.client;

import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.dongba.model.CharacterMotion;

public class MotionService extends Thread {
	
	private MessageTransporter mt;
	private JFrame frame;

	public MotionService(MessageTransporter mt) {
		this.mt = mt;
		this.frame = new JFrame("input motion");
	}
	
	public void run() {
		try {
			while (true) {
				String motion = JOptionPane.showInputDialog(frame, "input character motion.");
				CharacterMotion cm = parseMotion(motion);
				mt.send(cm);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private CharacterMotion parseMotion(String motion) {
		String[] split = motion.split(" ");
		return new CharacterMotion(split[0], Integer.parseInt(split[1]));
	}

}
