package com.singtel.zoo.model;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class AnimalTest {

	Animal animal;

	@Before
	public void iniTest() {
		animal = new Animal();
	}

	@Test
	public void testWalk() {
		assertEquals(true, animal.walk());
	}

}
