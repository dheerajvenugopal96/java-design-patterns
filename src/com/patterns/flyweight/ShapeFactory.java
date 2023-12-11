package com.patterns.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {

	private static Map<String, Shape> shapes = new HashMap<>();
	
	//we use a hasmap to save the object so the next time instead or creating a new object and store in memory
	//it will use the same object as the one created before
	public static Shape getShape(String type) {
		
		Shape shape = null;
		if(shapes.get(type) != null) {
			shape = shapes.get(type);
		}else {
			if(type.equals("circle")) {
				shape = new Circle();
			}else if(type.equals("rectangle")) {
				shape = new Rectangle();
			}
			shapes.put(type,shape);
		}
		return shape;
	}
}
