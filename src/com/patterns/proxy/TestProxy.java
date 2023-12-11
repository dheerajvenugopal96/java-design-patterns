package com.patterns.proxy;

public class TestProxy {

	public static void main(String[] args) {

		
		//CustomerProxy impl sits between client and customer so that it can load specific data differently
		
		//example is hibernate methods which load data lazily
		//spring and hibernate use reflection and create proxy classes on the fly of the actual classes and use them 
		//while executing the queries
		Customer customer = new CustomerProxyImpl();
		System.out.println(customer.getId());
		System.out.println(customer.getOrders().size());
	}

}
