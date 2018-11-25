package com.singtel.zoo.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CatTest {

	Cat cat;

	@Before
	public void iniTest() {
		cat = new Cat();
	}

	@Test
	public void testMakeSound() {
		assertEquals("Meow", cat.makeSound());
	}
		
}