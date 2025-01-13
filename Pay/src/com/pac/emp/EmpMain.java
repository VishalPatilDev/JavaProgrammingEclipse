package com.pac.emp;

import com.v.demos.SalesPerson;

public class EmpMain {
	public static void main(String[] args) {
		Payable allEmps[] = {new Developer(),new Manager(),new SalesPerson()};
//		for(int ctr=0;ctr<allEmps.length;ctr++) {
//			
//			allEmps[ctr].pay();
//		}

		EmpMain app = new EmpMain();
		app.salaryPayment(allEmps);
//		app.secreteCode(allEmps);
		
	}
	private void secreteCode(Employee[] allEmps) {
		for(Employee object:allEmps) {
			object.confidentialMethod();
		}
		
	}
	private void salaryPayment(Payable[] allEmps) {
		//for each
		for(Payable ref:allEmps) {
			ref.pay();
		}
	}
	

}
