package com.sai.spring.setterInjecton;

import java.util.Date;

public class Order {

	private int productId;
	private String productName;
	private Date orderDate;
	private Customer customer;
	
	
	public Order() {
		
	}
	
	
	public Order(int productId, String productName, Date orderDate, Customer customer) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.orderDate = orderDate;
		this.customer = customer;
	}
	
	public Order(String productName, int productId) {
		super();
		this.productId = productId;
		this.productName = productName;
		
	}


	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	@Override
	public String toString() {
		return "Order [productId=" + productId + ", productName=" + productName + ", orderDate=" + orderDate
				+ ", customer=" + customer + "]";
	}
	
	
}
