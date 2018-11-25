package com.singtel.zoo.model;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.singtel.zoo.model.walkinganimal.Dog;

public class DogTest {

	Dog dog;
	
	@Before
	public void iniTest() {
		dog = new Dog();
	}
	
	@Test
	public void testMakeSound() {
		assertEquals("Woof, woof", dog.makeSound());
	}

}
