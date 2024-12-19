package com.vishal.interfaceDemo;
//This sets up a relation : is -like-a
public class DemoClass implements Printable{
	int empId;
	String empName;
	DemoClass(){
		System.out.println("In DemoClass Constructor");
	}
	public DemoClass(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public void print() {
		System.out.println("Content of the object is : "+empId+","+empName);
	}

}
