package com.vishal.interfaceDemo;

public class Developer implements Employee{
	double salary;
	
	public Developer() {
		
	}
	public Developer(double salary) {
		super();
		this.salary = salary;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public void print() {
		System.out.println("Developer : Print");
	}

}
