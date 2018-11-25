package com.singtel.zoo.model.walkinganimal;

public class Dog extends Animal {
	private String name;

	public String makeSound() {
		System.out.println("Woof, woof");
		return "Woof, woof";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Dog(String name) {
		this.name = name;
	}

	public Dog() {
		super();
	}

}
