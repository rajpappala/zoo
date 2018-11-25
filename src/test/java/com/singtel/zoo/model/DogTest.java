package com.singtel.zoo.model;

import static org.junit.Assert.*;

import java.time.DayOfWeek;

import org.junit.Before;
import org.junit.Test;

import com.sun.org.apache.bcel.internal.generic.NEW;

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
