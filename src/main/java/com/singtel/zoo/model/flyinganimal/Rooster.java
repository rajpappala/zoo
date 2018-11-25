package com.singtel.zoo.model.flyinganimal;

public class Rooster extends Chicken {

	@Override
	public String makeSound() {
		System.out.println("Rooster:Cock-a-doodle-doo");
		return "Cock-a-doodle-doo";
	}

	@Override
	public boolean fly() {
		System.out.println("Rooster: can fly");
		return true;
	}
}
