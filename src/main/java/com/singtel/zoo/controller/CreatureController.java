package com.singtel.zoo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.singtel.zoo.dto.CreatureDTO;
import com.singtel.zoo.service.CreatureService;

@RestController("/creature/")
public class CreatureController {

	@Autowired
	CreatureService creatureService;

	@RequestMapping("/creature/all")
	public List<CreatureDTO> getDTOList() {
		return creatureService.getCreaturesList();
	}

	@RequestMapping("/creature/canfly")
	public List<CreatureDTO> getFlyableList() {
		return creatureService.getCanFlyAnimals();
	}

	@RequestMapping("/creature/canwalk")
	public List<CreatureDTO> getWalkableList() {
		return creatureService.getCanWalkAnimals();
	}

	@RequestMapping("/creature/canswim")
	public List<CreatureDTO> getSwimmingAnimalsList() {
		return creatureService.getCanSwimAnimals();
	}

	@RequestMapping("/creature/canmakesound")
	public List<CreatureDTO> geAnimalsCanMAkeSoundList() {
		return creatureService.getCanMakeSoundAnimals();
	}

}
