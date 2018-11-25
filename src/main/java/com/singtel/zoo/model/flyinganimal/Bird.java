package com.singtel.zoo.model.flyinganimal;

import com.singtel.zoo.model.Flyinganimal;
import com.singtel.zoo.model.Walkinganimal;

public class Bird implements Flyinganimal,Walkinganimal {

	public boolean fly() {
		System.out.println("I am flying");
		return true;
	}

	public String sing() {
		System.out.println("I am singing");
		return "I am singing";
	}
}
