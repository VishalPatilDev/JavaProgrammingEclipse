package com.pac.bank;

public class Bank {
    private Account[] accounts; 
    private int accountCount;  
    public Bank(int maxAccounts) {
        accounts = new Account[maxAccounts];
        
        accountCount = 0;
    }

    public void addAccount(Account account) {
        if (accountCount < accounts.length) {
            accounts[accountCount] = account;
            accountCount++; 
            System.out.println("✔ Account successfully added: " + account.accountNumber);
        } else {
            System.out.println("❌ Cannot add account. Bank is at full capacity.");
        }
    }

    public Account findAccount(String accountNumber) {
        for (int i = 0; i < accountCount; i++) {
            if (accounts[i].accountNumber.equals(accountNumber)) {
                return accounts[i];
            }
        }
        return null; 
    }

    public void deleteAccount(String accountNumber) {
        for (int i = 0; i < accountCount; i++) {
            if (accounts[i].accountNumber.equals(accountNumber)) {

                for (int j = i; j < accountCount - 1; j++) {
                    accounts[j] = accounts[j + 1];
                }
                accounts[accountCount - 1] = null;
                accountCount--;
                System.out.println("✔ Account " + accountNumber + " has been deleted.");
                return;
            }
        }
        System.out.println("❌ Account not found.");
    }

    public void displayAllAccounts() {
        if (accountCount == 0) {
            System.out.println("No accounts available in the bank.");
            return;
        }
        for (int i = 0; i < accountCount; i++) {
            accounts[i].displayAllDetails();
        }
    }

    public void calculateInterestForAll() {
        if (accountCount == 0) {
            System.out.println("No accounts available to calculate interest.");
            return;
        }
        for (int i = 0; i < accountCount; i++) {
            accounts[i].calculateInterest();
        }
    }
    public boolean isAcExists(String acNo) {
    	for(int i=0;i<accountCount;i++) {
    		if(accounts[i].accountNumber.equals(acNo)) {
    			return true;
    		}
    	}
    	return false;
    }
}

