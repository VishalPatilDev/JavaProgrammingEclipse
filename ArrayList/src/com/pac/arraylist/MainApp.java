package com.pac.arraylist;
import java.util.ArrayList;
import java.util.List;
import pac.demo.exception.*;




public class MainApp {

	public static void main(String[] args) {
		List<BankAccount> randomThings = new ArrayList<BankAccount>();
		System.out.println(randomThings.size());
//		randomThings.add("Kuchbhi");
//		randomThings.add(12);
//		randomThings.add(true);
		System.out.println(randomThings);
//		System.out.println("Size after adding data :"+randomThings.size());
//		randomThings.remove(2);
		System.out.println("Size after data remove:"+randomThings.size());
//		randomThings.add(6,"Sixth");    //index out of bound exception
//		randomThings.add(1,"Sixth");
		randomThings.add(new BankAccount(1,"x",20000));
		
		randomThings.add(new BankAccount(2,"y",25000));
		System.out.println("Size after adding data :"+randomThings.size());
		System.out.println(randomThings);
		for(int ctr=0;ctr<randomThings.size();ctr++ ) {
//			System.out.println(randomThings.get(ctr));
			if(randomThings.get(ctr) instanceof BankAccount) {
				BankAccount ref = (BankAccount)randomThings.get(ctr);
			}
		}
		
	}

}
