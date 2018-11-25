package com.singtel.zoo.util;

import com.singtel.zoo.model.Creature;

public class BehaviourUtil {

	public static String makeSound(Creature creature) {
		String sound = "NA";
		Class<? extends Creature> clazz = creature.getClass();
		try {
			sound = (String) clazz.getMethod("makeSound").invoke(creature, null);
		} catch (Exception e) {
		}
		return sound;
	}

}
