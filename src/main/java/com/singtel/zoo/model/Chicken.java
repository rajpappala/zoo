package com.singtel.zoo.model;

public class Chicken extends Bird {

	public String makeSound() {
		System.out.println("Chicken:Cluck, cluck");
		return "Cluck, cluck";
	}

	public boolean fly() {
		System.out.println("Chicken: cannot fly");
		return false;
	}

}
