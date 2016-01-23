package com.dongba.model;

import java.io.Serializable;

public class ChatMessage implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4241694825845063296L;
	
	private String characterId;
	
	private String message;
	
	public ChatMessage(String characterId, String message) {
		this.characterId = characterId;
		this.message = message;
	}

	public String getCharacterId() {
		return characterId;
	}

	public void setCharacterId(String characterId) {
		this.characterId = characterId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
