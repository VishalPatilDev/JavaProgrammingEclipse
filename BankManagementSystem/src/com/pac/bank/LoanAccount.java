package com.pac.bank;

//LoanAccount.java
public class LoanAccount extends Account {
 private final double interestRate = 0.05;

 public LoanAccount(String accountNumber, String accountHolderName, double loanAmount,
                    String accHolderAddress, String contactNumber) {
     super(accountNumber, accountHolderName, -loanAmount, accHolderAddress, contactNumber, "Loan");
 }

 @Override
 public void withdraw(double amount) {
     System.out.println("❌ Withdrawals are not allowed from Loan Accounts.");
 }

 @Override
 public void calculateInterest() {
     double interest = Math.abs(accountBalance) * interestRate;
     accountBalance -= interest;
     System.out.println("Account Holder Name : "+accountHolderName);
     System.out.printf("✔ Loan interest of Rs. %.2f applied. New balance: Rs. %.2f%n", interest, accountBalance);
 }

 @Override
 public void displayAllDetails() {
     printHeader("LOAN ACCOUNT DETAILS");
     System.out.printf("%-20s: %s%n", "Account Number", accountNumber);
     System.out.printf("%-20s: %s%n", "Account Holder", accountHolderName);
     System.out.printf("%-20s: Rs. %.2f%n", "Loan Balance", accountBalance);
     System.out.printf("%-20s: %s%n", "Address", accHolderAddress);
     System.out.printf("%-20s: %s%n", "Contact Number", contactNumber);
     System.out.println("=".repeat(50));
 }
}
