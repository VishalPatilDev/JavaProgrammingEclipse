package com.pac.bank;

//BankAutomation.java
public class BankAutomation {
 public static void main(String[] args) {
     // Savings Account
     SavingsAccount savings = new SavingsAccount("SA123", "Alice", 15000);
     savings.displayAccountInfo();
     savings.withdraw(6000);
     savings.displayAccountInfo();

     System.out.println();

     // Salary Account
     SalaryAccount salary = new SalaryAccount("SAL456", "Bob", 12000);
     salary.displayAccountInfo();
     salary.checkAccountStatus();
     salary.deposit(22000);
     salary.checkAccountStatus();

     System.out.println();

     // Current Account
     CurrentAccount current = new CurrentAccount("CA789", "Charlie", 5000, 10000);
     current.displayAccountInfo();
     current.withdraw(30000);
     current.displayAccountInfo();

     System.out.println();

     // Loan Account
     LoanAccount loan = new LoanAccount("LN101", "David", 50000);
     loan.displayAccountInfo();
     loan.calculateInterest();
     loan.displayAccountInfo();
 }
}

