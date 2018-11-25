package com.singtel.zoo.model.walkinganimal;

import com.singtel.zoo.model.Walkinganimal;

public class Animal implements Walkinganimal {

	public boolean walk() {
		System.out.println("I am walking");
		return true;
	}

}
