package pac.demo.bank;
import java.util.Scanner;

public class Bank {
	Account accounts[];
	int accCount;
	public Bank(){
		accounts=new Account[100];
		accCount=0;
	}
	public void addAccount(Account account) {
		if(accCount<accounts.length) {
			accounts[accCount]=account;
			accCount++;
			System.out.println("✔ Account successfully added: " + account.acNo);
        } 
		else {
            System.out.println("❌ Cannot add account. Bank is at full capacity.");
        }
	}
	public void deleteAccount(String accountNumber) {
		for(int i=0;i<accCount;i++) {
			if(accounts[i].acNo.equals(accountNumber)) {
				for(int j=i;j<accCount-1;j++) {
					accounts[j]=accounts[j+1];
				}
				accounts[accCount-1]=null;
				accCount--;
				System.out.println("✔ Account " + accountNumber + " has been deleted.");
                return;
				
			}
			
		}
		System.out.println("❌ Account not found.");
	}
	public boolean isAcExists(String accountNumber) {
		for(int i=0;i<accCount;i++) {
			if(accounts[i].acNo.equals(accountNumber)) {
				return true;
			}
		}
		return false;
	}
	
	public void displayAllAccounts() {
        if (accCount == 0) {
            System.out.println("No accounts available in the bank.");
            return;
        }
        for (int i = 0; i < accCount; i++) {
            accounts[i].displayAllDetails();
        }
    }
	public void calculateInterestForAll() {
        if (accCount == 0) {
            System.out.println("No accounts available to calculate interest.");
            return;
        }
        System.out.println("Enter Account Number :");
        Scanner sc = new Scanner(System.in);
        String accNum = sc.next();
        for(int i=0;i<accCount;i++) {
        	if(accounts[i].acNo.equals(accNum)) {
        		accounts[i].calculateInterest();
        		return;
        		
        	}
        }
        System.out.println("Account not found");
//        for (int i = 0; i < accCount; i++) {
//        	accounts[i].calculateInterest();
//        }
    }
	public void accLifeCycle() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Account Number : ");
		String accNo = sc.next();
		
		for(int i=0;i<accCount;i++) {
			if(accounts[i].acNo.equals(accNo)) {
				System.out.println("-----------Account LifeCycle from Account Created and account delete-------------");
				System.out.println("Account Details : ");
				accounts[i].displayAllDetails();
				System.out.println("Transactions Performed on Account : ");
				accounts[i].displayTransactionHistory();
			}
		}
	}
	
	
	

}
