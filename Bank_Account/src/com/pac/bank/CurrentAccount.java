package com.pac.bank;

//CurrentAccount.java
public class CurrentAccount extends Account {
 private double overdraftLimit=20000;

 public CurrentAccount(String accountNumber, String accountHolderName, double initialBalance, double overdraftLimit) {
     super(accountNumber, accountHolderName, initialBalance);
//     this.overdraftLimit = overdraftLimit;
 }

 @Override
 public void withdraw(double amount) {
     if (amount > 0 && (balance - amount) >= -overdraftLimit) {
         balance -= amount;
         System.out.println("Withdrew: ₹" + amount + " | New Balance: ₹" + balance);
     } else {
         System.out.println("Withdrawal denied! Exceeds overdraft limit of ₹" + overdraftLimit);
     }
 }

 @Override
 public void displayAccountInfo() {
     System.out.println("Current Account Info: " + accountHolderName + " | Account No: " + accountNumber + " | Balance: ₹" + balance + " | Overdraft Limit: ₹" + overdraftLimit);
 }
}
