package com.singtel.zoo.model;

public interface Walkinganimal extends Creature {

	default boolean walk() {
		System.out.println("I am walking");
		return true;
	}
}
