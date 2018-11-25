package com.singtel.zoo.model.swimminganimal;

public class Shark extends Fish {

	private Colour colour;
	private Size size;

	public Shark() {
		// TODO Auto-generated constructor stub
		this.colour = Colour.GREY;
		this.size = Size.LARGE;
	}

	public boolean eat(Fish fish) {
		System.out.println("eating" + fish);
		return true;
	}

	public Colour getColour() {
		return colour;
	}

	public Size getSize() {
		return size;
	}

	
}
