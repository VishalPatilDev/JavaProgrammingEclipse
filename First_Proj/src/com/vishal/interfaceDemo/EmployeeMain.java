package com.vishal.interfaceDemo;

public class EmployeeMain {
	public static void main(String[] args) {
		Employee[] ref= {new Developer() , new Admin() ,new Trainer()};
		for(int ctr=0;ctr<ref.length;ctr++) {
			ref[ctr].print();
		}
	}

}
