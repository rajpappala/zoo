package com.singtel.zoo.model.flyinganimal;

public class Duck extends Bird {
	String name;

	public Duck() {
		super();
	}

	public Duck(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String makeSound() {
		System.out.println("Duck: Quack, quack");
		return "Quack, quack";
	}

	public boolean swim() {
		System.out.println("Duck: Im Swimming");
		return true;
	}
}
