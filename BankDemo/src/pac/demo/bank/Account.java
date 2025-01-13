package pac.demo.bank;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import pac.demo.bank.Transaction;

public abstract class Account {
	protected List <Transaction> transactions;
	String acNo;
	String name;
	String address;
	String contactNo;
	double balance;
	String type;
	
	public Account(String acNo, String name,String address, String contactNo, double balance,String type) {
		super();
		this.acNo = acNo;
		this.name = name;
		this.address=address;
		this.contactNo = contactNo;
		this.balance = balance;
		this.type=type;
		this.transactions = new ArrayList<>();
	}
	public void deposit(double amt) {
		balance+=amt;
		transactions.add(new Transaction("Deposit", amt, balance));
		System.out.printf("Deposited Rs. %.2f. New balance: Rs. %.2f%n", amt, balance);
	}
	public void displayTransactionHistory() {
        if (transactions.isEmpty()) {
            System.out.println("No transactions available.");
            return;
        }
        for (Transaction transaction : transactions) {
            System.out.println(transaction.getTransactionDetails());
            System.out.println("-".repeat(50));
        }
    }
	public abstract void withdraw(double amt);
	public abstract void displayAllDetails();
	public abstract void calculateInterest();
	public void updateAccount() {
		System.out.println("What would you like to update?");
		int choice;
        System.out.println("1. Name  2. Address  3. Contact Number");
        System.out.print("Enter your choice: ");
        Scanner sc = new Scanner(System.in);
        choice = sc.nextInt();
        switch(choice) {
        case 1  : 
        	System.out.println("Enter name : ");
        	String newName = sc.nextLine();
        	this.name = newName;
        	System.out.println("Account Updated Successfully !");
        	break;
        case 2:
        	System.out.println("Enter Address :");
        	String newAddress = sc.nextLine();
        	this.address = newAddress;
        	System.out.println("Account Updated Successfully !");
        	break;
        case 3:
        	System.out.println("Enter Contact Number : ");
        	String newContact = sc.next();
        	this.contactNo=newContact;
        	System.out.println("Account Updated Successfully !");
        	break;
        default:
            System.out.println("❌ Invalid update choice!");
        }
	}

	

}
