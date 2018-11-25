package com.singtel.zoo.model.swimminganimal;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DolphinTest {

	Dolphin dolphin;

	@Before
	public void iniTest() {
		dolphin = new Dolphin();
	}

	@Test
	public void testMakeJoke() {
		assertTrue(dolphin.swim());
	}

}
