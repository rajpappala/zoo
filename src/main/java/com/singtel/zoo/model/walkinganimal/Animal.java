package com.singtel.zoo.model.walkinganimal;

import com.singtel.zoo.model.Flyinganimal;

public class Animal implements Flyinganimal {

	public boolean walk() {
		System.out.println("I am walking");
		return true;
	}

}
