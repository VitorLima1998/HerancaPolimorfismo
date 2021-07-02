package entities;

import enums.Color;

public abstract class Shape {
	
	private Color color;
	
//Constructors
	
	public Shape () {
		
	}

	public Shape(Color color) {
		super();
		this.color = color;
	}
	
//Getters e Setters

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
//Functions
	
	public abstract double area();


}
