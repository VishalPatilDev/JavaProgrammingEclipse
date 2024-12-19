package com.vishal.pac;

public class Account {
	int actId;
	String actName;
	float balance;
	Address postal;
	public Account() {
		System.out.println("Account Deafault Contructor called ");

	}
	public Account(int actId, String actName, float balance, Address postal) {
		super();
		this.actId = actId;
		this.actName = actName;
		this.balance = balance;
		this.postal = postal;
		System.out.println(this.hashCode());
	}

	public int getActId() {
		return actId;
	}

	public void setActId(int actId) {
		this.actId = actId;
	}

	public String getActName() {
		return actName;
	}

	public void setActName(String actName) {
		this.actName = actName;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public Address getPostal() {
		return postal;
	}

	public void setPostal(Address postal) {
		this.postal = postal;
	}
	public void withdraw(double amount) {
		balance-=amount;
	}
	public void deposit(double amount) {
		balance+=amount;
	}
}

