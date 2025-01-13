package pac.demo.bank;

public class SalaryAccount extends Account{
	int mwt=0;
	SalaryAccount(String acNo,String name,String address,String contactNo,double balance){
		super(acNo,name,address,contactNo,balance,"Salary");
	}

	@Override
	public void withdraw(double amt) {
		if(balance-amt<10000) {
			System.out.println("Can't withdraw minimum balance is less than 10000");
		}
		else {
			balance-=amt;
			mwt=0;
			transactions.add(new Transaction("Withdrawal",amt,balance));
			System.out.printf("✔ Withdrawn Rs. %.2f. New balance: Rs. %.2f%n", amt, balance);
		}
		
	}

	@Override
	public void displayAllDetails() {
		System.out.println("Salary ACCOUNT DETAILS");
	     System.out.printf("%-20s: %s%n", "Account Number", acNo);
	     System.out.printf("%-20s: %s%n", "Account Holder", name);
	     System.out.printf("%-20s: Rs. %.2f%n", "Balance", balance);
	     System.out.printf("%-20s: %s%n", "Address", address);
	     System.out.printf("%-20s: %s%n", "Contact Number", contactNo);
	     if (mwt >= 2) {
	         System.out.println("⚠ Warning: This account is frozen due to 2 months of inactivity.");
	     }
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
