package com.patterns.adapter;

public class PaymentAdapter {
	
	public void payment(int rupees) {
		
		int convertedDollars = rupees/80;
		
		PaymentProcessor processor = new PaymentProcessorImpl();
		System.out.println("in dollars "+processor.pay(convertedDollars));
	}

}
