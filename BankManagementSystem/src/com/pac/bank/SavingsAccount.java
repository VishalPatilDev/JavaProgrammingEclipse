package com.pac.bank;

//SavingsAccount.java
public class SavingsAccount extends Account {

 public SavingsAccount(String accountNumber, String accountHolderName, double accountBalance,
                       String accHolderAddress, String contactNumber) {
     super(accountNumber, accountHolderName, accountBalance, accHolderAddress, contactNumber, "Savings");
 }

 @Override
 public void withdraw(double amount) {
     if (accountBalance - amount < 10000) {
         System.out.println("❌ Withdrawal denied! Minimum balance of Rs. 10,000 must be maintained.");
     } else {
         accountBalance -= amount;
         transactions.add(new Transaction("Withdrawal", amount, accountBalance));
         System.out.printf("✔ Withdrawn Rs. %.2f. New balance: Rs. %.2f%n", amount, accountBalance);
     }
 }

 @Override
 public void calculateInterest() {
     double interest = accountBalance * 0.03;
     accountBalance += interest;
     System.out.println("Account Holder Name : "+accountHolderName);
     System.out.printf("✔ Interest of Rs. %.2f added. New balance: Rs. %.2f%n", interest, accountBalance);
 }

 @Override
 public void displayAllDetails() {
     printHeader("SAVINGS ACCOUNT DETAILS");
     System.out.printf("%-20s: %s%n", "Account Number", accountNumber);
     System.out.printf("%-20s: %s%n", "Account Holder", accountHolderName);
     System.out.printf("%-20s: Rs. %.2f%n", "Balance", accountBalance);
     System.out.printf("%-20s: %s%n", "Address", accHolderAddress);
     System.out.printf("%-20s: %s%n", "Contact Number", contactNumber);
     System.out.println("=".repeat(50));
 }
}
