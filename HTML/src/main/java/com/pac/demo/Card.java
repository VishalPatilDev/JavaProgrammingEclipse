package com.pac.demo;


//This is known as an entity class
//Also known as VO (Value Object)/ DTO (Data Transfer Object)
//Also known as POJO ( Plain Old JavaObject) / Bean

//Reflection Library - to automate the process
public class Card {
	String cardnumber;
	String cardholder;
	String expiry;
	String cvv;
	public Card() {
		
	}
	public Card(String cardnumber, String cardholder, String expiry, String cvv) {
		super();
		this.cardnumber = cardnumber;
		this.cardholder = cardholder;
		this.expiry = expiry;
		this.cvv = cvv;
	}
	public String getCardnumber() {
		return cardnumber;
	}
	public void setCardnumber(String cardnumber) {
		this.cardnumber = cardnumber;
	}
	public String getCardholder() {
		return cardholder;
	}
	public void setCardholder(String cardholder) {
		this.cardholder = cardholder;
	}
	public String getExpiry() {
		return expiry;
	}
	public void setExpiry(String expiry) {
		this.expiry = expiry;
	}
	public String getCvv() {
		return cvv;
	}
	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
	
	

}
