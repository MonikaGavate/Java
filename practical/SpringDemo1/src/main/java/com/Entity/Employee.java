package com.Entity;

public class Employee {
private int id;
private String ename;
private String email;
private Address address;//aggregation
public Employee(int id, String ename, String email,Address address) {
	super();
	this.id = id;
	this.ename = ename;
	this.email = email;
	this.address=address;
}

public void show() {
	System.out.println(id+ " " +ename+ " "+email);
	System.out.println(address.toString());
}
}
