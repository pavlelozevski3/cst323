package com.gcu.business;

import java.util.ArrayList;
import java.util.List;

import com.gcu.model.OrderModel;

public class AnotherOrdersBusinessService implements OrdersBusinessServiceInterface {

	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("Hello from the AnotherOrdersBusinessService."); 
	}
	
    @Override
    public List<OrderModel> getOrders() {
        List<OrderModel> orders = new ArrayList<>();
        orders.add(new OrderModel(1L, "000000001", "Product 1", 1.00f, 1));
        orders.add(new OrderModel(2L, "000000002", "Product 2", 2.00f, 2));
        orders.add(new OrderModel(3L, "000000003", "Product 3", 3.00f, 3));
        orders.add(new OrderModel(4L, "000000004", "Product 4", 4.00f, 4));
        orders.add(new OrderModel(5L, "000000005", "Product 5", 5.00f, 5));
        return orders;
    }
    
    @Override
    public void init() {
    	System.out.print("Method init() has been called.");
    }

    @Override
    public void destroy() {
    	System.out.print("Method destroy() has been called.");
    }

}
