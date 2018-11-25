package com.singtel.zoo.model.walkinganimal;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class CaterpillarTest {

	Caterpillar caterpillar;

	@Before
	public void iniTest() {
		caterpillar = new Caterpillar();
	}
	
	@Test
	public void testWalk(){
		assertTrue(caterpillar.walk());
	}

}
