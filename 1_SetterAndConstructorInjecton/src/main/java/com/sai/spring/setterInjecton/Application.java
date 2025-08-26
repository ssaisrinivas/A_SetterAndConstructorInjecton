package com.sai.spring.setterInjecton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("configmetadata.xml");

		 
		System.out.println("From Setter Injuction \n");
		
		Customer customer = (Customer) context.getBean("cus");
		System.out.println("Name: "+customer.getName());
		System.out.println("Contact: "+customer.getContact());
		System.out.println("Addresses: "+customer.getAddress());
		
		System.out.println();
		
		Order order = (Order) context.getBean("order");
		System.out.println("ProductId: "+order.getProductId());
		System.out.println("Contact: "+order.getProductName());
		System.out.println("Addresses: "+order.getOrderDate());
		System.out.println("Addresses: "+order.getCustomer());
		
		System.out.println();
		System.out.println();
		
		System.out.println("From Constructor Injuction \n");
		Customer customer1 = (Customer) context.getBean("cus");
		System.out.println("Customer Details : "+ customer1.toString());
		
		Order order1 = (Order) context.getBean("ord");
		System.out.println("Order Details : "+ order1.toString());
		
	
		
	}
}
