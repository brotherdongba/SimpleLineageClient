package com.dongba.model;

import java.io.Serializable;

public class CharacterMotion implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5153139806296677435L;
	
	private String characterId;

	private String targetId;
	
	private int damage;

	private int type;
	
	public CharacterMotion(String characterId, String targetId, int damage) {
		this.characterId = characterId;
		this.targetId = targetId;
		this.damage = damage;
		type = 1;
	}

	public String getTargetId() {
		return targetId;
	}

	public void setTargetId(String targetId) {
		this.targetId = targetId;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}
	
	public String getCharacterId() {
		return characterId;
	}

	public void setCharacterId(String characterId) {
		this.characterId = characterId;
	}

	@Override
	public String toString() {
		return "CharacterMotion [targetId=" + targetId + ", damage=" + damage
				+ "]";
	}

}
