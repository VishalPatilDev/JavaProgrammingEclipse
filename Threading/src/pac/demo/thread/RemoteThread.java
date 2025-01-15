package pac.demo.thread;

public class RemoteThread implements Runnable {

	@Override
	public void run() {
		process3();
		process4();
		
	}
	public void process3() {
		System.out.println("P3 - Create Database");
	}
	public void process4() {
		System.out.println("P4 - Connect Database ");
	}


}
