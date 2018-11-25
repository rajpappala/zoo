package com.singtel.zoo.util;

import com.singtel.zoo.model.Creature;

public enum CreatureUtils {
	FLY {

		@Override
		public boolean action(Creature creature) {
			Class<? extends Creature> clazz = creature.getClass();
			boolean b;
			try {
				b = (boolean) clazz.getMethod("fly").invoke(creature, null);
			} catch (Exception e) {
				return false;
			}
			return b;
		}

	},
	WALK {

		@Override
		public boolean action(Creature creature) {

			Class<? extends Creature> clazz = creature.getClass();
			boolean b;
			try {
				b = (boolean) clazz.getMethod("walk").invoke(creature, null);
			} catch (Exception e) {
				return false;
			}
			return b;
		}

	},
	MAKESOUND {

		@Override
		public boolean action(Creature creature) {

			Class<? extends Creature> clazz = creature.getClass();
			try {
				System.out.println(clazz.getMethod("makeSound").getName());
			} catch (Exception e) {
				return false;
			}
			return true;
		}

	},
	SWIM {

		@Override
		public boolean action(Creature creature) {

			Class<? extends Creature> clazz = creature.getClass();
			boolean b;
			try {
				b = (boolean) clazz.getMethod("swim").invoke(creature, null);
			} catch (Exception e) {
				return false;
			}
			return b;
		}

	};

	public abstract boolean action(Creature creature);
}
