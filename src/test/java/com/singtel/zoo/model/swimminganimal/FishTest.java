package com.singtel.zoo.model.swimminganimal;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.singtel.zoo.model.swimminganimal.Fish;

public class FishTest {

	Fish fish;

	@Before
	public void iniTest() {
		fish = new Fish();
	}

	@Test
	public void testSwim() {
		assertEquals(true, fish.swim());
	}

}
