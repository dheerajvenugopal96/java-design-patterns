package com.patterns.facade;

public class OrderProcessor {
	
	public boolean checkStock(String order) {
		System.out.println("Checking stock");
		return true;
	}
	
	public String placeOrder(String name,int quantity) {
		System.out.println("Order placed");
		return "abc123";
	}
	
	public void shipOrder(String orderId) {
		System.out.println("Order shipped");
	}

}
