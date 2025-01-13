package pac.demo.exception;

public class Main {
	public static void main(String[] args) {
		BankAccount ac = new BankAccount(101,"vishal",1000);
		try {
			ac.withdraw(1500);
		} catch (LowBalException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			e.sendMail();
		}
//		System.out.println(ac.getBalance());
	}
	
	

}
