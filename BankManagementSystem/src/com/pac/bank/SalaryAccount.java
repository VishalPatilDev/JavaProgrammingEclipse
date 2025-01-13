package com.pac.bank;

//SalaryAccount.java
public class SalaryAccount extends Account {
 private int monthsWithoutTransaction = 0;

 public SalaryAccount(String accountNumber, String accountHolderName, double accountBalance,
                      String accHolderAddress, String contactNumber) {
     super(accountNumber, accountHolderName, accountBalance, accHolderAddress, contactNumber, "Salary");
 }

 @Override
 public void withdraw(double amount) {
     if (accountBalance - amount < 0) {
         System.out.println("❌ Insufficient balance!");
     } else {
         accountBalance -= amount;
         monthsWithoutTransaction = 0;
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
     printHeader("SALARY ACCOUNT DETAILS");
     System.out.printf("%-20s: %s%n", "Account Number", accountNumber);
     System.out.printf("%-20s: %s%n", "Account Holder", accountHolderName);
     System.out.printf("%-20s: Rs. %.2f%n", "Balance", accountBalance);
     System.out.printf("%-20s: %s%n", "Address", accHolderAddress);
     System.out.printf("%-20s: %s%n", "Contact Number", contactNumber);
     System.out.printf("%-20s: %d months%n", "Months Inactive", monthsWithoutTransaction);
     if (monthsWithoutTransaction >= 2) {
         System.out.println("⚠ Warning: This account is frozen due to 2 months of inactivity.");
     }
     System.out.println("=".repeat(50));
 }
}
