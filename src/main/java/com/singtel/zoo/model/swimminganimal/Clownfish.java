package com.singtel.zoo.model.swimminganimal;

public class Clownfish extends Fish {
	private Colour colour;
	private Size size;
	private String name;

	public Clownfish() {
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Clownfish(String name) {
		super();
		this.name = name;
		this.size = Size.SMALL;
		this.colour = Colour.ORANGE;
	}

}
