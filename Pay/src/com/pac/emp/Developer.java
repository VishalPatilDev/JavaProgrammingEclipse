package com.pac.emp;

public class Developer extends Employee implements Payable{
	public void pay() {
		System.out.println("Developer : Pay");
	}

	@Override
	public void confidentialMethod() {
		System.out.println("Developer Confidential Method");
	}

}
