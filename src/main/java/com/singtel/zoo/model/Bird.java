package com.singtel.zoo.model;

public class Bird extends Animal {

	public boolean fly() {
		System.out.println("I am flying");
		return true;
	}

	public String sing() {
		System.out.println("I am singing");
		return "I am singing";
	}
}
