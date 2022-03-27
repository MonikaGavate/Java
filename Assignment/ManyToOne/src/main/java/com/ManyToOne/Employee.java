package com.ManyToOne;

import javax.persistence.*;
@Table(name="employeee")
@Entity
public class Employee {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int e_id;
		 private String e_name;
	 
	 @ManyToOne(cascade = CascadeType.ALL)
		 private Company com;
	public int getId() {
		return e_id;
	}
	public void setId(int e_id) {
		this.e_id = e_id;
	}
	public String getName() {
		return e_name;
	}
	public void setName(String e_name) {
		this.e_name = e_name;
	}
	public Company getCom() {
		return com;
	}
	public void setCom(Company com) {
		this.com = com;
	}
	
	 
	
	 
}
