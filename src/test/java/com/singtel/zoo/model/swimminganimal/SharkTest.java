package com.singtel.zoo.model.swimminganimal;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SharkTest {

	Shark shark;
	Fish fish;

	@Before
	public void iniTest() {
		shark = new Shark();
		fish = new Fish();
	}

	@Test
	public void testEat() {
		assertTrue(shark.eat(fish));
	}

	@Test
	public void testSize() {
		assertEquals(Size.LARGE, shark.getSize());
	}

	@Test
	public void testColour() {
		assertEquals(Colour.GREY, shark.getColour());
	}
}
