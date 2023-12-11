package com.patterns.decorator;

public class PizzaShop {

	public static void main(String[] args) {
		
		/*
		 * Cheese Pizza can take Plain pizza as argument as it is of same type pizza
		 * you can chain decorator like this of same type
		 * */
		Pizza pizza = new VeggiePizzaDecorator(new CheesePizzaDecorator(new PlainPizza()));
		pizza.bake();
		
		
	}
}
