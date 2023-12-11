package com.patterns.adapter;

public class PaymentUI {

	public static void main(String[] args) {
		
		PaymentAdapter adapter = new PaymentAdapter();
		adapter.payment(1000);
	}
}
