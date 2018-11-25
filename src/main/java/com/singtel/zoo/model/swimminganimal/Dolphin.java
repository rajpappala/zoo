package com.singtel.zoo.model.swimminganimal;

import com.singtel.zoo.model.SwimmingAnimal;

public class Dolphin implements SwimmingAnimal {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Dolphin(String name) {
		super();
		this.name = name;
	}

	public Dolphin() {
		super();
	}

}
