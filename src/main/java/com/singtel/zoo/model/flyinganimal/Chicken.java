package com.singtel.zoo.model.flyinganimal;

public class Chicken extends Bird {
	private String name;

	public Chicken() {
	}

	public Chicken(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String makeSound() {
		System.out.println("Chicken:Cluck, cluck");
		return "Cluck, cluck";
	}

	public boolean fly() {
		System.out.println("Chicken: cannot fly");
		return false;
	}

}
