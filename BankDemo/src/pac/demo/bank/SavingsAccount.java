package pac.demo.bank;

public class SavingsAccount extends Account{
	

	SavingsAccount(String acNo,String name,String address,String accContact,double balance){
		super(acNo,name,address,accContact,balance,"Savings");
	}
	@Override
	public void withdraw(double amt) {
		if(balance-amt<10000) {
			System.out.println("❌ Withdrawal denied! Minimum balance of Rs. 10,000 must be maintained.");
		}
		else {
			balance-=amt;
			transactions.add(new Transaction("Withdrawal",amt,balance));
			System.out.printf("✔ Withdrawn Rs. %.2f. New balance: Rs. %.2f%n", amt, balance);
		}
		
	}

	@Override
	public void displayAllDetails() {
		     System.out.println("SAVINGS ACCOUNT DETAILS");
		     System.out.printf("%-20s: %s%n", "Account Number", acNo);
		     System.out.printf("%-20s: %s%n", "Account Holder", name);
		     System.out.printf("%-20s: Rs. %.2f%n", "Balance", balance);
		     System.out.printf("%-20s: %s%n", "Address", address);
		     System.out.printf("%-20s: %s%n", "Contact Number", contactNo);
		     System.out.println("=".repeat(50));
		 
		
	}

	@Override
	public void calculateInterest() {
		double interest = balance*0.03;
		balance+=interest;
		System.out.println("Account Holder Name : "+name);
	    System.out.printf("✔ Interest of Rs. %.2f added. New balance: Rs. %.2f%n", interest, balance);
	}
	
}
