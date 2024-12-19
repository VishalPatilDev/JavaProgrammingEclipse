package com.vishal.pac;

public class Employee {
	int id;
	String name;
	double sal;
	Employee(){
		this.id=0;
		this.name = "none";
		this.sal = 0;
		System.out.println("Employee:Constructor");
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}
	
	public Employee(int id, String name, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	
	public void attendance() {
		System.out.println("Employee:Attendance");
	}
	public void calSalary(Employee e) {
		System.out.println(e.sal); 
	}
//	public void calAllSalaries(Employee[] empArray) {
//		double totalSal=0;
//		for(Employee ref:empArray) {
//			totalSal += ref.calSalary();
//			ref.calSalary();
//			
//		}
	}

