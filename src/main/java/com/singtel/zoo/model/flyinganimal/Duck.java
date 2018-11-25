package com.singtel.zoo.model.flyinganimal;

public class Duck extends Bird {

	public String makeSound() {
		System.out.println("Duck: Quack, quack");
		return "Quack, quack";
	}
	public boolean swim() {
		System.out.println("Duck: Im Swimming");
		return true;
	}
}
