package com.singtel.zoo.model.walkinganimal;

public class Cat extends Animal {
	private String name;

	public String makeSound() {
		System.out.println("Meow");
		return "Meow";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Cat(String name) {
		this.name = name;
	}

	public Cat() {
		super();
	}

}
