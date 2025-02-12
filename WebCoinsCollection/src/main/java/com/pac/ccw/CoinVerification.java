package com.pac.ccw;

public class CoinVerification {
	public boolean verify(Coin ref) {
		Connectivity connectRef = new DatabaseConnectivity();
		return connectRef.isValid(ref);
		
	}

	
		
		
	

}
