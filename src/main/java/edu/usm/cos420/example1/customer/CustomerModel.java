package edu.usm.cos420.example1.customer;

public class CustomerModel {
	int ID;
	String name;
	String address;
		
	private CustomerModel(int customerID, String customerName, String customerAddress) {
		ID = customerID;
		name = customerName;
		address = customerAddress;
	}
	
	//getters
	public int getID() {
		return this.ID;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	//setters
	public void setID(int id) {
		this.ID = id;
	}
	
	public void setName(String n) {
		this.name = n;
	}
	
	public void setAddress(String add) {
		this.address = add;
	}
}
