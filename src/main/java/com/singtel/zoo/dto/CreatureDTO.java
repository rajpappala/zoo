package com.singtel.zoo.dto;

import com.singtel.zoo.model.Creature;

public class CreatureDTO {

	private boolean canFly;
	private boolean canWalk;
	private boolean canSwim;
	private boolean canMakeSound;
	private Creature creature;
	private String makesound;

	public boolean isCanFly() {
		return canFly;
	}

	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}

	public boolean isCanWalk() {
		return canWalk;
	}

	public void setCanWalk(boolean canWalk) {
		this.canWalk = canWalk;
	}

	public boolean isCanSwim() {
		return canSwim;
	}

	public void setCanSwim(boolean canSwim) {
		this.canSwim = canSwim;
	}

	public boolean isCanMakeSound() {
		return canMakeSound;
	}

	public void setCanMakeSound(boolean canMakeSound) {
		this.canMakeSound = canMakeSound;
	}

	public Creature getCreature() {
		return creature;
	}

	public void setCreature(Creature creature) {
		this.creature = creature;
	}

	public String getSound() {
		return makesound;
	}

	public void setSound(String makesound) {
		this.makesound = makesound;
	}

}
