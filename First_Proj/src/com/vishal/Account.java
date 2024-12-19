package com.vishal;

public abstract class Account {
	int acNo;
	String acName;
	double balance;
	Account(){
		//to initialize private variables in abstract class constructor is mandatory.
	}
	public Account(int acNo, String acName, double balance) {
		super();
		this.acNo = acNo;
		this.acName = acName;
		this.balance = balance;
	}
	
	public int getAcNo() {
		return acNo;
	}
	public void setAcNo(int acNo) {
		this.acNo = acNo;
	}
	public String getAcName() {
		return acName;
	}
	public void setAcName(String acName) {
		this.acName = acName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void credit() {
		this.balance = 1000;
	}
	
	public abstract void withdraw(double amount);
	public abstract void deposit(double amount);

}
