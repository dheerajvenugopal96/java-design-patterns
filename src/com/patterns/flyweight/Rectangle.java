package com.patterns.flyweight;

public class Rectangle extends Shape {
	
	private String label;
	

	public Rectangle() {
		this.label = "Rectangle";
	}

	@Override
	public void draw(int length,int breadth) {
		System.out.println("Drawing "+label+" with length "+length+" breadth "+breadth);

	}

}
