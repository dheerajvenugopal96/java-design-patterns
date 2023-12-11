package com.patterns.proxy;

import java.util.ArrayList;
import java.util.List;

public class CustomerProxyImpl implements Customer {
	
	CustomerImpl customer = new CustomerImpl();

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return customer.getId();
	}

	@Override
	public List<Order> getOrders() {
		
		List<Order> order = new ArrayList<>();
		Order order1 = new Order();
		order1.setId(1);
		order1.setProductName("Iphone");
		order1.setQuantity(100);
		order.add(order1);
		Order order2 = new Order();
		order2.setId(2);
		order2.setProductName("Mac");
		order2.setQuantity(200);
		order.add(order2);
		return order;
	}

}
