package com.vishal.abstractDemo;

public class EmpMain {
	public static void main(String[] args) {
		Employee emps[]= {new Manager(),new Developer()};
		for(int ctr=0;ctr<emps.length;ctr++) {
			emps[ctr].print();
		}
	}

}
