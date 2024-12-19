
package com.vishal.pac;

public class MainApp {
	public static void main(String[] args) {
//		Account a = new Account();
		Address add = new Address("Deccan","Pune");
		Account ref = new Account(1,"Vishal",234313,new Address("Warje","Pune"));
		
//		System.out.println(ref.postal.loc);
//		System.out.println(ref.postal.city);
		System.out.println(ref.hashCode());
		//Account[] acts = new Accounts[3];
		Account[] allActs = {new Account(),new Account(),new Account()}; //even though there is no new keyword written for array it will crete the array obj on heap.
		for(int ctr=0;ctr<allActs.length;ctr++) {
			System.out.println(allActs[ctr]);
		}
		allActs[0].deposit(100);
		System.out.println(allActs[0].balance);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

//has a relationship is known as containnment
