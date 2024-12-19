package com.pac.bank;

//SalaryAccount.java
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class SalaryAccount extends SavingsAccount {
 private LocalDate lastTransactionDate;

 public SalaryAccount(String accountNumber, String accountHolderName, double initialBalance) {
     super(accountNumber, accountHolderName, initialBalance);
     this.lastTransactionDate = LocalDate.now();
 }

 @Override
 public void deposit(double amount) {
     super.deposit(amount);
     lastTransactionDate = LocalDate.now();
 }

 @Override
 public void withdraw(double amount) {
     super.withdraw(amount);
     lastTransactionDate = LocalDate.now();
 }

 public void checkAccountStatus() {
     long monthsSinceLastTransaction = ChronoUnit.MONTHS.between(lastTransactionDate, LocalDate.now());
     if (monthsSinceLastTransaction >= 2) {
         System.out.println("Account " + accountNumber + " is frozen due to inactivity for " + monthsSinceLastTransaction + " months.");
     } else {
         System.out.println("Account " + accountNumber + " is active.");
     }
 }

 @Override
 public void displayAccountInfo() {
     System.out.println("Salary Account Info: " + accountHolderName + " | Account No: " + accountNumber + " | Balance: ₹" + balance);
 }
}

