package com.pac.demo;

//working as a project manager
//This is a business logic component
public class CardVerification {
	public boolean verify(Card ref) {
//		DatabaseConnectivity dbConnect = new DatabaseConnectivity(); 
//		return dbConnect.isCardPresent(ref);
		
//		Connectivity connectRef = new FileConnectivity();
//		return connectRef.isValid(ref);
		
		Connectivity connectRef = new DatabaseConnectivity();
		return connectRef.isValid(ref);
	}
}
