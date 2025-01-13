package com.pac.emp;

public class Manager extends Employee implements Payable
{
	public void pay() {
		System.out.println("Manager : Pay ");
	}

	@Override
	public void confidentialMethod() {
		System.out.println("Manager : Confidential Method");
	}

}
