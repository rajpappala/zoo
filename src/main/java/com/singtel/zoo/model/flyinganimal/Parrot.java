package com.singtel.zoo.model.flyinganimal;

import com.singtel.zoo.model.Creature;

public class Parrot<E extends Creature> extends Bird {

	private E animal;

	public Parrot(E animal) {
		this.animal = animal;
	}

	public Parrot() {
		super();
	}

	public String makeSound() {
		String sound = "Default : Parrot Sound";
		Class<? extends Creature> clazz = animal.getClass();
		try {
			sound = (String) clazz.getMethod("makeSound", null).invoke(animal, null);
			//System.out.println(sound);
		} catch (Exception e) {
			//System.out.println(sound);
		}
		return sound;
	}

}
