package com.vishal.database;

public class DatabaseMain {
	public static void main(String[] args) {
//		Oracle o = new Oracle();
//		o.connect();
//		MySQL s = new MySQL();
//		s.connect();
		
		
		//to generalize
		Database ref =  ConnectivityFactory.getObject();   //at runtime we don't know which database is coming oracle or sql , we have to change name of class -> use factory design pattern it will change automatically.
		ref.connect();
		
		
		
//		Database ref [] = {new Oracle() , new MySQL()};
//		for(int ctr=0;ctr<ref.length;ctr++) {
//			ref[ctr].connect();
//		}
	}
}
