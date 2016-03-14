package com.dongba.model;

import java.io.Serializable;

public class Position implements Serializable {
	
	private static final long serialVersionUID = 5947741759247868348L;
	
	private int x;
	
	private int y;

	public Position(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}
