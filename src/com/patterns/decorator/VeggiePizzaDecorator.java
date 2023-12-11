package com.patterns.decorator;

public class VeggiePizzaDecorator extends PizzaDecorator {

	/*
	 * extends the pizzadecorator so that it can accept any class of the same type pizza
	 * */
	public VeggiePizzaDecorator(Pizza pizza) {
		super(pizza);
		
	}
	
	public void bake() {
		super.bake();
		System.out.println("Adding veggie toppings");
	}

}
