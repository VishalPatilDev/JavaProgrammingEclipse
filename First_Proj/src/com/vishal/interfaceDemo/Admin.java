package com.vishal.interfaceDemo;

public class Admin implements Employee{
	double insentive;
	
	public Admin() {
		
	}
	
	
	public Admin(double insentive) {
		super();
		this.insentive = insentive;
	}


	public double getInsentive() {
		return insentive;
	}


	public void setInsentive(double insentive) {
		this.insentive = insentive;
	}


	public void print() {
		System.out.println("Admin : Print");
	}

}
