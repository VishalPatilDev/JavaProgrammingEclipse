package pac.demo.bank;

public class CurrentAccount extends Account {
	final double draftLimit = 50000;
	CurrentAccount(String acNo,String name,String address,String contactNo,double balance){
		super(acNo,name,address,contactNo,balance,"Current");
	}

	@Override
	public void withdraw(double amt) {
		if(balance-amt<-draftLimit) {
			System.out.println("❌ Withdrawal denied! Overdraft limit of Rs. 50,000 exceeded.");
		}
		else {
			balance-=amt;
			transactions.add(new Transaction("Withdrawal",amt,balance));
			System.out.printf("✔ Withdrawn Rs. %.2f. New balance: Rs. %.2f%n", amt, balance);
		}
		
		
	}

	@Override
	public void displayAllDetails() {
		System.out.println("Current ACCOUNT DETAILS");
	     System.out.printf("%-20s: %s%n", "Account Number", acNo);
	     System.out.printf("%-20s: %s%n", "Account Holder", name);
	     System.out.printf("%-20s: Rs. %.2f%n", "Balance", balance);
	     System.out.printf("%-20s: %s%n", "Address", address);
	     System.out.printf("%-20s: %s%n", "Contact Number", contactNo);
	     System.out.println("=".repeat(50));
		
	}

	@Override
	public void calculateInterest() {
		// TODO Auto-generated method stub
		
	}
	
}
