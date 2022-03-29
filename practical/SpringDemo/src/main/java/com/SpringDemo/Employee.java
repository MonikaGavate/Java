package com.SpringDemo;

public class Employee {
	private int id;
	private String ename;
	private String email;
	public Employee(int id, String ename, String email) {
		super();
		this.id = id;
		this.ename = ename;
		this.email = email;
	}

	public void show() {
		System.out.println(id+ " " +ename+ " "+email);
}
}
