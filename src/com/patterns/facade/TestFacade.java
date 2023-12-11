package com.patterns.facade;

public class TestFacade {

	public static void main(String[] args) {
		
		OrderFacade facade = new OrderFacade();
		facade.processOrder("Macbook", 3);
	}
}
