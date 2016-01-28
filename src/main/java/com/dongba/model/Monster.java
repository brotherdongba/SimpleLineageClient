package com.dongba.model;

import java.io.Serializable;

public class Monster implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2235321415253057213L;
	
	private String fromCharacter;

	private String id;
	
	private String name;
	
	private int hp;

	private int type;
	
	public Monster(String fromCharacter, String id, String name, int hp) {
		this.fromCharacter = fromCharacter;
		this.id = id;
		this.name = name;
		this.hp = hp;
		type = 3;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public String getFromCharacter() {
		return fromCharacter;
	}

	public void setFromCharacter(String fromCharacter) {
		this.fromCharacter = fromCharacter;
	}

	@Override
	public String toString() {
		return "Monster [id=" + id + ", name=" + name + ", hp=" + hp + "]";
	}
	
}
