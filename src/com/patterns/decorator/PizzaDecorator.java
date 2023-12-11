package com.patterns.decorator;

public class PizzaDecorator implements Pizza {

	/*
	 * Takes the interface as argument to constructor and then calls the bake method
	 * */
	private Pizza pizza;
	
	public PizzaDecorator(Pizza pizza) {
		this.pizza = pizza;
	}
	@Override
	public void bake() {
		pizza.bake();
		
	}

}
