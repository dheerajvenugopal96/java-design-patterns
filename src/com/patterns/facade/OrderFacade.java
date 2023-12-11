package com.patterns.facade;

public class OrderFacade {

	
	private OrderProcessor processor = new OrderProcessor();

	//can be a facade for multiple classes also
	//hides logic from client
	public void processOrder(String name,int quantity) {
		if(processor.checkStock(name)) {
			String orderId = processor.placeOrder(name,quantity);
			processor.shipOrder(orderId);
		}
	}
}
