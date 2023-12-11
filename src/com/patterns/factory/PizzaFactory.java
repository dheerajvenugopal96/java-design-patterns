package com.patterns.factory;

public class PizzaFactory {
	
	//factory pattern hides the creation of the object 
	public static Pizza createPizza(String type) {
		
		Pizza p = null;
		if (type.equals("Cheese")) {
			p = new PlainCheessPizze();
		} else if (type.equals("Chicken")) {
			p = new ChickenCheesePizza();
		} else if (type.equals("Veggie")) {
			p = new VeggiePizza();
		}
		
		return p;
	}

}
