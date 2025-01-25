package com.pac.demo;

public class FileConnectivity implements Connectivity{
	public boolean checkInFile(Card ref) {
		//File and IO Stream code
		return true;
	}

	@Override
	public boolean isValid(Card ref) {
		// TODO Auto-generated method stub
		return checkInFile(ref);
	}

}
