package com.pac.bank;

import java.util.Scanner;

public class BankMS {
    static Bank bank = new Bank(100);
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean exit = false;


        bank.addAccount(new SavingsAccount("SAV001", "Alice", 15000, "123 Street", "1234567890"));
        bank.addAccount(new CurrentAccount("CUR001", "Bob", 5000, "456 Avenue", "9876543210"));
        bank.addAccount(new LoanAccount("LOAN001", "Charlie", 50000, "789 Boulevard", "5554443322"));
        bank.addAccount(new SalaryAccount("SAL001", "David", 20000, "321 Road", "1122334455"));

        while (!exit) {
            System.out.println("\n" + "=".repeat(50));
            System.out.printf("%25s%n", "BANK MANAGEMENT SYSTEM");
            System.out.println("=".repeat(50));
            System.out.println("1. Add Account");
            System.out.println("2. Account Lifecycle");
            System.out.println("3. Counter Activities");
            System.out.println("4. Interest Calculation");
            System.out.println("5. Display Transaction History");
            System.out.println("6. Exit");
            System.out.println("=".repeat(50));
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addAccount();
                    break;
                case 2:
                    bank.displayAllAccounts();
                    break;
                case 3:
                	counterActivities();
                	break;
                case 4:
                    bank.calculateInterestForAll();
                    break;
                case 5:
                    displayTransactionHistory();
                    break;
                case 6:
                    exit = true;
                    System.out.println("Exiting... Thank you for using Bank Management System!");
                    break;
                default:
                    System.out.println("❌ Invalid choice! Please enter a number between 1 and 5.");
            }
        }
    }

    static void addAccount() {
        System.out.println("\n" + "-".repeat(50));
        System.out.println("               ADD ACCOUNT");
        System.out.println("-".repeat(50));

        sc.nextLine();

        System.out.print("Enter Account Type (Savings/Current/Loan/Salary): ");
        String accType = sc.nextLine().trim();

        System.out.print("Enter Account Number: ");
        
        String accNum = sc.nextLine().trim();
        if(bank.isAcExists(accNum)) {
        	System.out.println("❌ Account Number Already Exists!");
        	return;
        	
        }

        System.out.print("Enter Account Holder Name: ");
        String accHolderName = sc.nextLine().trim();

        System.out.print("Enter Account Balance: ");
        double accBalance = sc.nextDouble();

        sc.nextLine(); 

        System.out.print("Enter Account Holder Address: ");
        String accAddress = sc.nextLine().trim();

        System.out.print("Enter Contact Number: ");
        String accContact = sc.nextLine().trim();


        Account newAccount = null;
        switch (accType.toLowerCase()) {
            case "savings":
                newAccount = new SavingsAccount(accNum, accHolderName, accBalance, accAddress, accContact);
                break;
            case "current":
                newAccount = new CurrentAccount(accNum, accHolderName, accBalance, accAddress, accContact);
                break;
            case "loan":
                newAccount = new LoanAccount(accNum, accHolderName, accBalance, accAddress, accContact);
                break;
            case "salary":
                newAccount = new SalaryAccount(accNum, accHolderName, accBalance, accAddress, accContact);
                break;
            default:
                System.out.println("❌ Invalid account type!");
                return;
        }


        bank.addAccount(newAccount);
        System.out.println("✔ Account successfully created!");
    }

    static void counterActivities() {
        System.out.println("\n" + "-".repeat(50));
        System.out.println("             COUNTER ACTIVITIES");
        System.out.println("-".repeat(50));

        System.out.print("Enter Account Number: ");
        String accNum = sc.next();
        Account acc = bank.findAccount(accNum);
        if (acc == null) {
            System.out.println("❌ Account not found!");
            return;
        }

        System.out.println("1. Withdraw  2. Deposit  3. Update  4. Delete");
        System.out.print("Enter your choice: ");
        int action = sc.nextInt();

        switch (action) {
            case 1:
                System.out.print("Enter Amount to Withdraw: ");
                double withdrawAmount = sc.nextDouble();
                acc.withdraw(withdrawAmount);
                break;
            case 2:
                System.out.print("Enter Amount to Deposit: ");
                double depositAmount = sc.nextDouble();
                acc.deposit(depositAmount);
                break;
            case 3:
                System.out.println("What would you like to update?");
                System.out.println("1. Name  2. Address  3. Contact Number");
                System.out.print("Enter your choice: ");
                int updateChoice = sc.nextInt();
                sc.nextLine(); 
                System.out.print("Enter new value: ");
                String newValue = sc.nextLine();
                acc.updateDetails(updateChoice, newValue);
                break;
            case 4:
                bank.deleteAccount(accNum);
                break;
            default:
                System.out.println("❌ Invalid action!");
        }
    }

    static void displayTransactionHistory() {
        System.out.print("Enter Account Number: ");
        String accNum = sc.next();
        Account acc = bank.findAccount(accNum);
        if (acc != null) {
            acc.displayTransactionHistory();
        } else {
            System.out.println("❌ Account not found.");
        }
    }
    
    
}
