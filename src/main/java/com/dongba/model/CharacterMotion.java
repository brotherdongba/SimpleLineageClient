package com.dongba.model;

import java.io.Serializable;

public class CharacterMotion implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5153139806296677435L;
	
	private String targetId;
	
	private int damage;
	
	public CharacterMotion(String targetId, int damage) {
		this.targetId = targetId;
		this.damage = damage;
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
	
	public String toString() {
		return "targetId : " + targetId + ", damage : " + damage;
	}

}
