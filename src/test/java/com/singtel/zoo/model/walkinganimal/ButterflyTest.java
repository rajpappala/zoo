package com.singtel.zoo.model.walkinganimal;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.singtel.zoo.model.walkinganimal.Caterpillar.Butterfly;

public class ButterflyTest {

	Butterfly butterfly;

	@Before
	public void iniTest() {
		butterfly = new Caterpillar().new Butterfly();
	}

	@Test
	public void testfly() {
		assertTrue(butterfly.fly());
	}

}
