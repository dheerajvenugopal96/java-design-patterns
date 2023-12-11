package com.patterns.factory;

public class PizzaStore {

	public Pizza orderPizza(String type) {
		
		//pizzaStore calls the factory and asks it to create the object based
		// on the type requested by the client 
		//pizzafactory abstracts the creation of the object and just delivers the object
		//back based on the request
		Pizza p = PizzaFactory.createPizza(type);
		
		p.prepare();
		p.bake();
		p.cut();

		return p;
	}
}
