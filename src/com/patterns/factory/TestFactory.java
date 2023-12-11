package com.patterns.factory;

public class TestFactory {
	
	public static void main(String[] args) {
		
		//Client just calls to the pizzastore
		PizzaStore ps = new PizzaStore();
		ps.orderPizza("Chicken");
	}

}
