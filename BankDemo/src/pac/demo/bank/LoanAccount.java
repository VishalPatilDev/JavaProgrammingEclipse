package pac.demo.bank;

public class LoanAccount extends Account{
	LoanAccount(String acNo,String name,String address,String contactNo,double balance){
		super(acNo,name,address,contactNo,balance,"Loan");
	}

	@Override
	public void withdraw(double amt) {
		System.out.println("❌ Withdrawals are not allowed from Loan Accounts.");
		
	}

	@Override
	public void displayAllDetails() {
		System.out.println("Loan ACCOUNT DETAILS");
	     System.out.printf("%-20s: %s%n", "Account Number", acNo);
	     System.out.printf("%-20s: %s%n", "Account Holder", name);
	     System.out.printf("%-20s: Rs. %.2f%n", "Balance", balance);
	     System.out.printf("%-20s: %s%n", "Address", address);
	     System.out.printf("%-20s: %s%n", "Contact Number", contactNo);
	     System.out.println("=".repeat(50));
		
	}

	@Override
	public void calculateInterest() {
		double interest = balance*0.05;
		balance -=interest;
		System.out.println("Account Holder Name : "+name);
	     System.out.printf("✔ Loan interest of Rs. %.2f applied. New balance: Rs. %.2f%n", interest, balance);
		
	}

}
