package com.singtel.zoo.model.flyinganimal;

import com.singtel.zoo.model.Creature;

public class Parrot<E extends Creature> extends Bird {

	private E animal;
	private String name;

	public String makeSound() {
		String sound = "Default : Parrot Sound";
		Class<? extends Creature> clazz = animal.getClass();
		try {
			sound = (String) clazz.getMethod("makeSound", null).invoke(animal, null);
			// System.out.println(sound);
		} catch (Exception e) {
			// System.out.println(sound);
		}
		return sound;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public E getAnimal() {
		return animal;
	}

	public void setAnimal(E animal) {
		this.animal = animal;
	}

	public Parrot(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public Parrot(E animal, String name) {
		super();
		this.animal = animal;
		this.name = name;
	}

	public Parrot(E animal) {
		super();
		this.animal = animal;
	}

	public Parrot() {
		super();
	}

}
