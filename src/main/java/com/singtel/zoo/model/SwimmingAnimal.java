package com.singtel.zoo.model;

public interface SwimmingAnimal extends Creature {

	default boolean swim() {
		System.out.println("I am swimming");
		return true;
	}

}
