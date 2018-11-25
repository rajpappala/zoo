package com.singtel.zoo.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DuckTest {

	Duck duck;

	@Before
	public void iniTest() {
		duck = new Duck();
	}

	@Test
	public void testMakeSound() {
		assertEquals("Quack, quack", duck.makeSound());
	}

	@Test
	public void testSwim() {
		assertEquals(true, duck.swim());
	}

}
