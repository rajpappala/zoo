package com.singtel.zoo.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BirdTest {

	Bird bird;

	@Before
	public void iniTest() {
		bird = new Bird();
	}

	@Test
	public void testFly() {
		assertEquals(true, bird.fly());
	}

	@Test
	public void testSing() {
		assertNotEquals(null, bird.sing());
	}

}
