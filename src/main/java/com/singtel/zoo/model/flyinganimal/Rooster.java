package com.singtel.zoo.model.flyinganimal;

public class Rooster extends Chicken {
	private String name;

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Rooster(String name) {
		super();
		this.name = name;
	}

	public Rooster() {
		super();
	}

}
