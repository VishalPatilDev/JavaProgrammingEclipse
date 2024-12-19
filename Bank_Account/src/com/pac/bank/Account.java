package com.pac.bank;

//Account.java
public abstract class Account {
 protected String accountNumber;
 protected String accountHolderName;
 protected double balance;

 public Account(String accountNumber, String accountHolderName, double initialBalance) {
     this.accountNumber = accountNumber;
     this.accountHolderName = accountHolderName;
     this.balance = initialBalance;
 }

 public abstract void displayAccountInfo();

 public void deposit(double amount) {
     if (amount > 0) {
         balance += amount;
         System.out.println("Deposited: ₹" + amount + " | New Balance: ₹" + balance);
     } else {
         System.out.println("Invalid deposit amount!");
     }
 }

 public void withdraw(double amount) {
     if (amount > 0 && amount <= balance) {
         balance -= amount;
         System.out.println("Withdrew: ₹" + amount + " | New Balance: ₹" + balance);
     } else {
         System.out.println("Invalid withdrawal amount or insufficient balance!");
     }
 }

 public double getBalance() {
     return balance;
 }
}
