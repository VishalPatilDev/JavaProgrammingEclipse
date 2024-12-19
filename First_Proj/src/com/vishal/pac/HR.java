package com.vishal.pac;

public class HR extends Employee{
	int noOfTeams;
	HR(){
		System.out.println("HR : Constructor");
		
	}
	public HR(int noOfTeams) {
		super();
		this.noOfTeams = noOfTeams;
	}
	public int getNoOfTeams() {
		return noOfTeams;
	}
	public void setNoOfTeams(int noOfTeams) {
		this.noOfTeams = noOfTeams;
	}
	public void calSalary(Employee e) {
		System.out.println(e.sal);
	}
	

}
