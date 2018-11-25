package com.singtel.zoo.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.singtel.zoo.model.flyinganimal.Rooster;

public class RoosterTest {

	Rooster rooster;

	@Before
	public void iniTest() {
		rooster = new Rooster();
	}

	@Test
	public void testMakeSound() {
		assertEquals("Cock-a-doodle-doo", rooster.makeSound());
	}
	
	@Test
	public void testfly() {
		assertEquals(true, rooster.fly());
	}

}
