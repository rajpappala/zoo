package com.singtel.zoo;

import com.singtel.zoo.model.swimminganimal.Clownfish;
import com.singtel.zoo.model.swimminganimal.Fish;
import com.singtel.zoo.model.swimminganimal.Shark;

public class SolutionB {

	public static void main(String[] args) {
		annswerQuestion2();
	}

	public static void annswerQuestion1() {
		System.out.println("Question 1,1(a),1(b),1(c)");
		Fish fish = new Fish();
		fish.swim();
	}
	
	public static void annswerQuestion2() {
		System.out.println("Question 2,2(a),2(b),2(c),2(d)");
		Shark shark=new Shark();
		shark.eat(new Fish());
		System.out.println(shark.getColour());
		System.out.println(shark.getSize());
		
		Clownfish clownfish= new Clownfish();
		clownfish.makeJoke();
		System.out.println(clownfish.getColour());
		System.out.println(clownfish.getSize());
		
		
	}

}
