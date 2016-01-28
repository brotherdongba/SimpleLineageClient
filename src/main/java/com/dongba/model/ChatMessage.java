package com.dongba.model;

import java.io.Serializable;

public class ChatMessage implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4241694825845063296L;

	private String characterId;
	
	private String message;

	private int type;
	
	public ChatMessage(String characterId, String message) {
		this.characterId = characterId;
		this.message = message;
		type = 2;
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

	@Override
	public String toString() {
		return "ChatMessage [characterId=" + characterId + ", message="
				+ message + "]";
	}

}
