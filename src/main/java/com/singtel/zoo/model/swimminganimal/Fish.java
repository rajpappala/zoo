package com.singtel.zoo.model.swimminganimal;

import com.singtel.zoo.model.SwimmingAnimal;

public class Fish implements SwimmingAnimal {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Fish(String name) {
		super();
		this.name = name;
	}

	public Fish() {
		super();
	}

}
