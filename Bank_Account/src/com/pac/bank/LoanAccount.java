package com.pac.bank;

//LoanAccount.java
public class LoanAccount extends Account {
 private double loanAmount;
 private static final double INTEREST_RATE = 0.05; // 5% annual interest rate

 public LoanAccount(String accountNumber, String accountHolderName, double loanAmount) {
     super(accountNumber, accountHolderName, -loanAmount);
     this.loanAmount = loanAmount;
 }

 public void calculateInterest() {
     double interest = Math.abs(balance) * INTEREST_RATE;
     balance -= interest;
     System.out.println("Interest of ₹" + interest + " applied. New Balance: ₹" + balance);
 }

 @Override
 public void displayAccountInfo() {
     System.out.println("Loan Account Info: " + accountHolderName + " | Account No: " + accountNumber + " | Loan Amount: ₹" + loanAmount + " | Balance: ₹" + balance);
 }
}
