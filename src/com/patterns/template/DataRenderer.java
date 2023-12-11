package com.patterns.template;

public abstract class DataRenderer {

	//we would have a method that calls in other abstract method
	//so the individual abstract methods implementation would be handled by their child classes
	//but the template piece here i.e the render would always perform the same and its implementation
	//would not be assigned to the children
	public void render() {
		String read  = readData();
		String processData = processData(read);
		System.out.println(processData);
	}
	
	public abstract String readData();
	
	public abstract String processData(String data) ;
}
