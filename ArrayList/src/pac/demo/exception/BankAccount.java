package pac.demo.exception;

public class BankAccount {
	int acNo;
	String holderName;
	double balance;
	public BankAccount() {
		
	}
	public BankAccount(int acNo, String holderName, double balance) {
//		super();
		this.acNo = acNo;
		this.holderName = holderName;
		this.balance = balance;
	}
	public int getAcNo() {
		return acNo;
	}
	public void setAcNo(int acNo) {
		this.acNo = acNo;
	}
	public String getHolderName() {
		return holderName;
	}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	void withdraw(double amt) throws LowBalException{
		if(amt>balance) {
			throw new LowBalException("Low Balance");
//			System.out.println("Can't Withdraw !");
		}
		else {
			balance -=amt;
		}
	}
	
	//Exception
//	public void withdraw (double amt) {
//		if(balance<amt) {
//			try {
//				
//				throw new LowBalException("Low Balance");
//			}
//			catch(LowBalException e) {
////				System.out.println(amt-balance+"required");
////				System.out.println("LowBalExeption");
//				e.printStackTrace();
//				
//			}
//			//throw new NullPointerException();
////			throw new LowBalException();
//			
//		}
//		else {
//			balance -=amt;
//		}
//	}
	

}
