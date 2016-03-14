package com.dongba.model;

import java.io.Serializable;

public class Account implements Serializable {
	
	private static final long serialVersionUID = 7859294584922295548L;
	
	private String id;
	
	private Character character;

	public Account(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Character getCharacter() {
		return character;
	}

	public void setCharacter(Character character) {
		this.character = character;
	}
	
}
