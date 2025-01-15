package pac.demo.cc.thread;

public class RemoteThread implements Runnable {

	@Override
	public void run() {
		process2();
		
	}
	void process2() {
		System.out.println("P2");
	}

}
