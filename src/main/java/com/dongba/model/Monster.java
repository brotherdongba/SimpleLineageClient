package com.dongba.model;

import java.io.Serializable;

public class Monster implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2235321415253057213L;

	private String id;
	
	private String name;
	
	private int hp;
	
	public Monster(String id, String name, int hp) {
		this.id = id;
		this.name = name;
		this.hp = hp;
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

	@Override
	public String toString() {
		return "Monster [id=" + id + ", name=" + name + ", hp=" + hp + "]";
	}
	
}
