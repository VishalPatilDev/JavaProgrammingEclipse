package com.vishal.pac;

public class Address {
	String loc;
	String city;
	public Address(){
		System.out.println("In Address Contructor");
	}
	public Address(String loc, String city) {
		super();
		this.loc = loc;
		this.city = city;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
}
