package com.sai.spring.setterInjecton;

public class Customer {

	private String name;
	private String contact;
	private String address;
	
	
	
	
	public Customer() {
		//super();
	}
	
	
	public Customer(String name, String contact, String address) {
		super();
		this.name = name;
		this.contact = contact;
		this.address = address;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	@Override
	public String toString() {
		return "Customer [name=" + name + ", contact=" + contact + ", address=" + address + "]";
	}
	
	
	
}
