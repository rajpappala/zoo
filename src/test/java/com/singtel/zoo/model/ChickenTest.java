package com.singtel.zoo.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.singtel.zoo.model.flyinganimal.Chicken;

public class ChickenTest {

	Chicken chicken;

	@Before
	public void iniTest() {
		chicken = new Chicken();
	}

	@Test
	public void testFly() {
		assertEquals(false, chicken.fly());
	}

	@Test
	public void testMakeSound() {
		assertEquals("Cluck, cluck", chicken.makeSound());
	}

}
