package com.singtel.zoo.model;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.singtel.zoo.model.flyinganimal.Parrot;
import com.singtel.zoo.model.flyinganimal.Rooster;
import com.singtel.zoo.model.walkinganimal.Cat;
import com.singtel.zoo.model.walkinganimal.Dog;

public class ParrotTest {

	Dog dog;
	Cat cat;
	Rooster rooster;

	@Before
	public void iniTest() {
		dog = new Dog();
		cat = new Cat();
		rooster = new Rooster();
	}

	@Test
	public void testParrotLivingWithCats() {
		Parrot<Cat> parrot = new Parrot<Cat>(cat);
		assertEquals("Meow", parrot.makeSound());
	}

	@Test
	public void testParrotLivingWithDogs() {
		Parrot<Dog> parrot = new Parrot<Dog>(dog);
		assertEquals("Woof, woof", parrot.makeSound());
	}

	@Test
	public void testParrotLivingWithRooster() {
		Parrot<Rooster> parrot = new Parrot<Rooster>(rooster);
		assertEquals("Cock-a-doodle-doo", parrot.makeSound());
	}

}
