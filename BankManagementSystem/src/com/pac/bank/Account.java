package com.pac.bank;

import java.util.ArrayList;
import java.util.List;

public abstract class Account {
    protected String accountNumber;
    protected String accountHolderName;
    protected double accountBalance;
    protected String accHolderAddress;
    protected String contactNumber;
    protected String type;


    protected List<Transaction> transactions;

    public Account(String accountNumber, String accountHolderName, double accountBalance,
                   String accHolderAddress, String contactNumber, String type) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountBalance = accountBalance;
        this.accHolderAddress = accHolderAddress;
        this.contactNumber = contactNumber;
        this.type = type;
        this.transactions = new ArrayList<>();
    }


    public abstract void withdraw(double amount);
    public abstract void calculateInterest();
    public abstract void displayAllDetails();


    public void deposit(double amount) {
        accountBalance += amount;
        transactions.add(new Transaction("Deposit", amount, accountBalance));
        System.out.printf("Deposited Rs. %.2f. New balance: Rs. %.2f%n", amount, accountBalance);
    }


    public void updateDetails(int choice, String newValue) {
        switch (choice) {
            case 1:
                this.accountHolderName = newValue;
                System.out.println("✔ Account holder name updated successfully.");
                break;
            case 2:
                this.accHolderAddress = newValue;
                System.out.println("✔ Account address updated successfully.");
                break;
            case 3:
                this.contactNumber = newValue;
                System.out.println("✔ Account contact number updated successfully.");
                break;
            default:
                System.out.println("❌ Invalid update choice!");
        }
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


    protected void printHeader(String title) {
        System.out.println("=".repeat(50));
        System.out.printf("%25s%n", title);
        System.out.println("=".repeat(50));
    }
}
