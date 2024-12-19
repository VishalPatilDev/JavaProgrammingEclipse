package com.pac.bank;

//SavingsAccount.java
public class SavingsAccount extends Account {
 private static final double MIN_BALANCE = 10000;

 public SavingsAccount(String accountNumber, String accountHolderName, double initialBalance) {
     super(accountNumber, accountHolderName, initialBalance);
 }

 @Override
 public void withdraw(double amount) {
     if (balance - amount >= MIN_BALANCE) {
         super.withdraw(amount);
     } else {
         System.out.println("Withdrawal denied! Minimum balance of ₹" + MIN_BALANCE + " must be maintained.");
     }
 }

 @Override
 public void displayAccountInfo() {
     System.out.println("Savings Account Info: " + accountHolderName + " | Account No: " + accountNumber + " | Balance: ₹" + balance);
 }
}

