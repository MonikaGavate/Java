package com.Entity;

public class Address {
	
	
	private String city,state,country;

	public Address(String city, String state, String country) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
	}

	
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", country=" + country + "]";
	}
	
	

}
