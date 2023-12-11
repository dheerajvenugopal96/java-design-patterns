package com.patterns.flyweight;

public class Circle extends Shape {
	
	private String label;
	
	//these properties are extrinsic and now are externalized out of this class
	/*
	 * private int radius;
	 * 
	 * 
	 * 
	 * public String getLabel() { return label; }
	 * 
	 * public void setLabel(String label) { this.label = label; }
	 * 
	 * public int getRadius() { return radius; }
	 * 
	 * public void setRadius(int radius) { this.radius = radius; }
	 */

	Circle(){
		this.label = "Circle";
	}

	@Override
	public void draw(int radius) {
		System.out.println("Drawing "+label+" with radius "+radius);

	}

}
