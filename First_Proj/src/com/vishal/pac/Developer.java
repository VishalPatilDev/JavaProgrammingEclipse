package com.vishal.pac;

public class Developer extends Employee{
	String skillSet;
	public Developer(String skillSet) {
		super();
		this.skillSet = skillSet;
	}
	public String getSkillSet() {
		return skillSet;
	}
	public void setSkillSet(String skillSet) {
		this.skillSet = skillSet;
	}
	Developer(){
		System.out.println("Developer: Construuctor");
	}
	public void attendance() {
		System.out.println("Developer:Attendance");
	}
	public void calSalary(Employee e) {
		System.out.println(e.sal); 
	}
	

}
