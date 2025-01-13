package com.pac.bank;

//CurrentAccount.java
public class CurrentAccount extends Account {
 private final double maxDraftLimit = 50000;

 public CurrentAccount(String accountNumber, String accountHolderName, double accountBalance,
                       String accHolderAddress, String contactNumber) {
     super(accountNumber, accountHolderName, accountBalance, accHolderAddress, contactNumber, "Current");
 }

 @Override
 public void withdraw(double amount) {
     if (accountBalance - amount < -maxDraftLimit) {
         System.out.println("❌ Withdrawal denied! Overdraft limit of Rs. 50,000 exceeded.");
     } else {
         accountBalance -= amount;
         transactions.add(new Transaction("Withdrawal", amount, accountBalance)); // Log transaction
         System.out.printf("✔ Withdrawn Rs. %.2f. New balance: Rs. %.2f%n", amount, accountBalance);
     }
 }

 @Override
 public void calculateInterest() {
//     System.out.println("Current Accounts do not accrue interest.");
 }

 @Override
 public void displayAllDetails() {
     printHeader("CURRENT ACCOUNT DETAILS");
     System.out.printf("%-20s: %s%n", "Account Number", accountNumber);
     System.out.printf("%-20s: %s%n", "Account Holder", accountHolderName);
     System.out.printf("%-20s: Rs. %.2f%n", "Balance", accountBalance);
     System.out.printf("%-20s: %s%n", "Address", accHolderAddress);
     System.out.printf("%-20s: %s%n", "Contact Number", contactNumber);
     System.out.printf("%-20s: Rs. %.2f%n", "Overdraft Limit", maxDraftLimit);
     System.out.println("=".repeat(50));
 }
}
