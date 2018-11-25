package com.singtel.zoo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.singtel.zoo.dto.CreatureDTO;
import com.singtel.zoo.model.Creature;
import com.singtel.zoo.util.BehaviourUtil;
import com.singtel.zoo.util.CreatureUtils;

@Service
public class CreatureService {
	@Autowired
	List<Creature> creaturelist;

	List<CreatureDTO> creatureDTO;

	public List<CreatureDTO> getCreaturesList() {
		creatureDTO = new ArrayList<CreatureDTO>();
		creaturelist.forEach(creature -> mapModelToDTO(creatureDTO, creature));
		return creatureDTO;
	}

	public List<CreatureDTO> getCanFlyAnimals() {
		creatureDTO = new ArrayList<CreatureDTO>();
		creaturelist.stream().filter(c -> CreatureUtils.FLY.action(c))
				.forEach(creature -> mapModelToDTO(creatureDTO, creature));
		return creatureDTO;
	}

	public List<CreatureDTO> getCanWalkAnimals() {
		creatureDTO = new ArrayList<CreatureDTO>();
		creaturelist.stream().filter(c -> CreatureUtils.WALK.action(c))
				.forEach(creature -> mapModelToDTO(creatureDTO, creature));
		return creatureDTO;
	}

	public List<CreatureDTO> getCanSwimAnimals() {
		creatureDTO = new ArrayList<CreatureDTO>();
		creaturelist.stream().filter(c -> CreatureUtils.SWIM.action(c))
				.forEach(creature -> mapModelToDTO(creatureDTO, creature));
		return creatureDTO;
	}

	public List<CreatureDTO> getCanMakeSoundAnimals() {
		creatureDTO = new ArrayList<CreatureDTO>();
		creaturelist.stream().filter(c -> CreatureUtils.MAKESOUND.action(c))
				.forEach(creature -> mapModelToDTO(creatureDTO, creature));
		return creatureDTO;
	}

	private void mapModelToDTO(List<CreatureDTO> creatureDTO, Creature creature) {
		CreatureDTO dto = new CreatureDTO();
		dto.setCreature(creature);
		dto.setCanFly(CreatureUtils.FLY.action(creature));
		if (CreatureUtils.MAKESOUND.action(creature)) {
			dto.setCanMakeSound(true);
			dto.setSound(BehaviourUtil.makeSound(creature));
		}
		dto.setCanSwim(CreatureUtils.SWIM.action(creature));
		dto.setCanWalk(CreatureUtils.WALK.action(creature));
		creatureDTO.add(dto);
	}
}
