package pac.demo.bank;
import java.util.Scanner;

import pac.demo.bank.Account;
public class Main {
	static Bank bank= new Bank();
	
	public static void main(String[] args) {
		bank.addAccount(new SavingsAccount("SAV001", "Alice",  "123 Street", "1234567890",15000));
        bank.addAccount(new CurrentAccount("CUR001", "Bob",  "456 Avenue", "9876543210",5000));
        bank.addAccount(new LoanAccount("LOAN001", "Charlie",  "789 Boulevard", "5554443322",50000));
        bank.addAccount(new SalaryAccount("SAL001", "David",  "321 Road", "1122334455",20000));
		Scanner sc = new Scanner(System.in);
		boolean exit = false;
		while(!exit) {
			
//			System.out.println("1. Add Account");
			System.out.println("1. Counter Activities");
			System.out.println("2. Account Lifecycle");
			System.out.println("3. Transaction Details");
			System.out.println("4. Interest Calculation");
			System.out.println("5. Exit");
			System.out.println("Enter your choice :");
			int choice;
			choice = sc.nextInt();
			switch(choice) {
//			case 1:
//				addAccount();
//				break;
			case 1:
				counterActivities();
				break;
			case 2:
				bank.accLifeCycle();
//				bank.displayAllAccounts();
				break;
			case 3:
				displayTransactionHistory();
				break;
			case 4:
				bank.calculateInterestForAll();
				break;
				
			case 5:
				exit=true;
				break;
				
			}
		}
	}
	static void addAccount() {
		Scanner sc = new Scanner(System.in);
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
                newAccount = new SavingsAccount(accNum, accHolderName,  accAddress, accContact,accBalance);
                break;
            case "current":
                newAccount =new CurrentAccount(accNum, accHolderName,  accAddress, accContact,accBalance);
                break;
            case "loan":
                newAccount =new LoanAccount(accNum, accHolderName,  accAddress, accContact,accBalance);
                break;
            case "salary":
                newAccount = new SalaryAccount(accNum, accHolderName,  accAddress, accContact,accBalance);
                break;
            default:
                System.out.println("❌ Invalid account type!");
                return;
        }
        bank.addAccount(newAccount);
        System.out.println("✔ Account successfully created!");
	}
	static void counterActivities() {
		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter Account Number: ");
//        String accNum = sc.next();
//        for(int i=0;i<bank.accCount;i++) {
//        	if(bank.accounts[i].acNo.equals(accNum)) {
        		System.out.println("1.Add Account  2. Withdraw  3. Deposit  4. Update  5. Delete");
                System.out.print("Enter your choice: ");
                
                int action = sc.nextInt();

                switch (action) {
                	case 1:
                		addAccount();
                		break;
                    case 2:
                    System.out.print("Enter Account Number: ");
                      String accNum = sc.next();
                      for(int i=0;i<bank.accCount;i++) {
                      	if(bank.accounts[i].acNo.equals(accNum)) {
                      		System.out.print("Enter Amount to Withdraw: ");
                      		double withdrawAmount = sc.nextDouble();
                      		bank.accounts[i].withdraw(withdrawAmount);
                      	}
                      }
                      		break;
                    case 3:
                    	System.out.print("Enter Account Number: ");
                        accNum = sc.next();
                        for(int i=0;i<bank.accCount;i++) {
                        	if(bank.accounts[i].acNo.equals(accNum)) {
                        System.out.print("Enter Amount to Deposit: ");
                        double depositAmount = sc.nextDouble();
                        bank.accounts[i].deposit(depositAmount);
                        	}
                        }
                        break;
                    case 4:
                    	System.out.print("Enter Account Number: ");
                         accNum = sc.next();
                        for(int i=0;i<bank.accCount;i++) {
                        	if(bank.accounts[i].acNo.equals(accNum)) {
                        bank.accounts[i].updateAccount();
                        	}
                        }
                        break;
                    case 5:
                    	System.out.print("Enter Account Number: ");
                        accNum = sc.next();
                        for(int i=0;i<bank.accCount;i++) {
                        	if(bank.accounts[i].acNo.equals(accNum)) {
                        bank.deleteAccount(accNum);
                        	}
                        }
                        break;
                    default:
                        System.out.println("❌ Invalid action!");
                }
//        	}
//        }
	}
	static void displayTransactionHistory() {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account Number: ");
        String accNum = sc.next();
        for(int i=0;i<bank.accCount;i++) {
        	if(bank.accounts[i].acNo.equals(accNum)) {
        		bank.accounts[i].displayTransactionHistory();
        		return;
        	}
      
        }
        System.out.println("❌ Account not found.");
       
    }
}
