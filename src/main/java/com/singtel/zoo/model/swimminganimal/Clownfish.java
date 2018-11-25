package com.singtel.zoo.model.swimminganimal;

public class Clownfish extends Fish {
	private Colour colour;
	private Size size;

	public Clownfish() {
		// TODO Auto-generated constructor stub
		this.size = Size.SMALL;
		this.colour = Colour.ORANGE;
	}

	public boolean makeJoke() {
		System.out.println("Clownfish making jokes");
		return true;
	}

	public Colour getColour() {
		return colour;
	}

	public Size getSize() {
		return size;
	}
	
	
}
