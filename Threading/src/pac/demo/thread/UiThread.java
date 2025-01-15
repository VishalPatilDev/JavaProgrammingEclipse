package pac.demo.thread;

public class UiThread implements Runnable{
	

	@Override
	public void run() {
		process1();
		process2();
		
	}
	public void process1() {
		System.out.println("P1 - Create Ui");
	}
	public void process2() {
		System.out.println("P2 - Design Ui");
	}

}
