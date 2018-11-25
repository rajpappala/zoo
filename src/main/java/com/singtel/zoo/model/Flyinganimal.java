package com.singtel.zoo.model;

public interface Flyinganimal extends Creature {

	default boolean fly() {
		System.out.println("I am flying");
		return true;
	}
}
