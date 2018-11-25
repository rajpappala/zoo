package com.singtel.zoo.model.walkinganimal;

import com.singtel.zoo.model.Walkinganimal;

public class Animal implements Walkinganimal {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Animal(String name) {
		super();
		this.name = name;
	}

	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}

}
