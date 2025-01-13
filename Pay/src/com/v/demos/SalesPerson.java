package com.v.demos;
import com.pac.emp.*;

public class SalesPerson implements Payable{

	@Override
	public void pay() {
		System.out.println("SalesPerson : Pay");
		
	}


//	public void confidentialMethod() {                     //no access to this method as this is not in the payable
//		System.out.println("Money is mine ");            
//		
//	}
	
	
	

}
