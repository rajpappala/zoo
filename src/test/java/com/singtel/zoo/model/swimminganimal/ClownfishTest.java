package com.singtel.zoo.model.swimminganimal;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ClownfishTest {

	Clownfish clownfish;

	@Before
	public void iniTest() {
		clownfish = new Clownfish();
	}

	@Test
	public void testMakeJoke() {
		assertTrue(clownfish.makeJoke());
	}

	@Test
	public void testSize() {
		assertEquals(Size.SMALL, clownfish.getSize());
	}

	@Test
	public void testColour() {
		assertEquals(Colour.ORANGE, clownfish.getColour());
	}

}
