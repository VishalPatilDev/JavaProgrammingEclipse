package com.vishal;

public class SavingsAccount extends Account{
	double minBalance;
	SavingsAccount(){
		
	}
	public SavingsAccount(int acNo, String acName, double balance, double minBalance) {
		super(acNo, acName, balance);
		this.minBalance = minBalance;
	}
	public double getMinBalance() {
		return minBalance;
	}
	public void setMinBalance(double minBalance) {
		this.minBalance = minBalance;
	}
	
	public void withdraw(double amount) {
		balance -= amount;
		
	}
	public void deposit(double amount) {
		balance +=amount;
	}

}
