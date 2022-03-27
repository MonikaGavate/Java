package com.ManyToOne;

import javax.persistence.*;

@Table(name="company")
@Entity
public class Company {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int c_id;
	private String c_name;
	

	public int getId() {
		return c_id;
	}
	public void setId(int c_id) {
		this.c_id = c_id;
	}
	public String getCname() {
		return c_name;
	}
	public void setCname(String c_name) {
		this.c_name = c_name;
	}
	
	
	
	
}
