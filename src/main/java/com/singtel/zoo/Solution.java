package com.singtel.zoo;

import com.singtel.zoo.model.Bird;
import com.singtel.zoo.model.Chicken;
import com.singtel.zoo.model.Duck;

public class Solution {

	public static void main(String[] args) {
		annswerQuestion2();
	}

	public static void annswerQuestion1() {
		// Implemented Sign method
		// Optimised code
		// Unit test implemented for Animal and Bird
		System.out.println("####Question 1,1(a),1(b)");
		Bird bird = new Bird();
		bird.walk();
		bird.fly();
		bird.sing();
	}

	public static void annswerQuestion2() {
		System.out.println("####Question 2,2(a),2(b)");
		Duck duck = new Duck();
		duck.makeSound();
		duck.swim();
		System.out.println("####Question 2,2(c),2(d)");
		Chicken chicken = new Chicken();
		chicken.makeSound();
		chicken.fly();

	}

}
