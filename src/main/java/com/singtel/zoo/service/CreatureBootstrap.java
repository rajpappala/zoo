package com.singtel.zoo.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.singtel.zoo.model.Creature;
import com.singtel.zoo.model.flyinganimal.Bird;
import com.singtel.zoo.model.flyinganimal.Chicken;
import com.singtel.zoo.model.flyinganimal.Duck;
import com.singtel.zoo.model.flyinganimal.Parrot;
import com.singtel.zoo.model.flyinganimal.Rooster;
import com.singtel.zoo.model.swimminganimal.Clownfish;
import com.singtel.zoo.model.swimminganimal.Dolphin;
import com.singtel.zoo.model.swimminganimal.Fish;
import com.singtel.zoo.model.swimminganimal.Shark;
import com.singtel.zoo.model.walkinganimal.Cat;
import com.singtel.zoo.model.walkinganimal.Caterpillar;
import com.singtel.zoo.model.walkinganimal.Dog;

@Configuration
public class CreatureBootstrap {

	@Bean
	public List<Creature> getList() {
		List<Creature> creatures = Arrays.asList(new Bird("Bird"), new Duck("Duck"), new Chicken("Ckicken"),
				new Rooster("Rooster"), new Parrot<Dog>(new Dog("Dog1"), "Parraot1"),
				new Parrot<Cat>(new Cat("cat1"), "Parraot2"), new Parrot<Rooster>(new Rooster("Rooster2"), "Parraot3"),
				new Fish("fish"), new Shark("Shark"), new Clownfish("Clownfish"), new Dolphin("Dolphin"),
				new Dog("Dog2"), new Caterpillar("Caterpillar1").new Butterfly("Butterfly1"), new Cat("cat"));
		return creatures;
	}
}
