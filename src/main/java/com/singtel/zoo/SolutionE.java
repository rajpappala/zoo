package com.singtel.zoo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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
import com.singtel.zoo.util.CreatureUtils;

public class SolutionE {
	public static void main(String[] args) {
		annswerQuestion1();
	}

	public static void annswerQuestion1() {
		List<Creature> creatures = Arrays.asList(new Bird(), new Duck(), new Chicken(), new Rooster(),
				new Parrot<Dog>(new Dog()), new Fish(), new Shark(), new Clownfish(), new Dolphin(), new Dog(),
				new Caterpillar().new Butterfly(), new Cat());
		List<Creature> creaturesCanWalk = creatures.stream().filter(c -> CreatureUtils.WALK.action(c))
				.collect(Collectors.toList());
		List<Creature> creaturesCanFly = creatures.stream().filter(c -> CreatureUtils.FLY.action(c))
				.collect(Collectors.toList());
		List<Creature> creaturesCanSing = creatures.stream().filter(c -> CreatureUtils.SWIM.action(c))
				.collect(Collectors.toList());
		List<Creature> creaturesCanSwim = creatures.stream().filter(c -> CreatureUtils.MAKESOUND.action(c))
				.collect(Collectors.toList());
		System.out.println(creaturesCanWalk);
		System.out.println(creaturesCanFly);
		System.out.println(creaturesCanSing);
		System.out.println(creaturesCanSwim);
	}
}
