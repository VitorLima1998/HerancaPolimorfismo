package entities;

import enums.Color;

public class Circle extends Shape {
	
	private Double radius;
	
//Constructors
	
	public Circle() {
		super();
	}

	public Circle(Color color, Double radius) {
		super(color);
		this.radius = radius;
	}

//Getters & Setters
	
	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}
 
//Functions 
	
	@Override
	public double area() {
		return Math.PI * radius * radius;
	}
}
