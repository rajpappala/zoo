package com.singtel.zoo;

import com.singtel.zoo.model.flyinganimal.Bird;
import com.singtel.zoo.model.flyinganimal.Chicken;
import com.singtel.zoo.model.flyinganimal.Duck;
import com.singtel.zoo.model.flyinganimal.Parrot;
import com.singtel.zoo.model.flyinganimal.Rooster;
import com.singtel.zoo.model.walkinganimal.Cat;
import com.singtel.zoo.model.walkinganimal.Dog;

public class SolutionA {

	public static void main(String[] args) {
		annswerQuestion2();
	}

	public static void annswerQuestion1() {
		// Implemented Sign method
		// Optimised code
		// Unit test implemented for Animal and Bird
		System.out.println("Question 1,1(a),1(b)");
		Bird bird = new Bird();
		bird.walk();
		bird.fly();
		bird.sing();
	}

	public static void annswerQuestion2() {
		System.out.println("Question 2,2(a),2(b)");
		Duck duck = new Duck();
		duck.makeSound();
		duck.swim();
		System.out.println("####Question 2,2(c),2(d)");
		Chicken chicken = new Chicken();
		chicken.makeSound();
		chicken.fly();

	}
	
	public static void annswerQuestion3() {
		System.out.println("Question 3,3(a),3(b)");
		Rooster rooster=new Rooster();
		rooster.makeSound();
		rooster.fly();

	}
	
	public static void annswerQuestion4() {
		System.out.println("Question 4,4(a),4(b),4(c),4(d)");
		Dog dog=new Dog();
		Parrot<Dog> parrotLivingWithDog=new Parrot<Dog>(dog);
		parrotLivingWithDog.makeSound();
		
		Cat cat=new Cat();
		Parrot<Cat> parrotLivingWithcat=new Parrot<Cat>(cat);
		parrotLivingWithcat.makeSound();
		
		Rooster rooster=new Rooster();
		Parrot<Rooster> parrotLivingWithRooster=new Parrot<Rooster>(rooster);
		parrotLivingWithRooster.makeSound();

	}

}
