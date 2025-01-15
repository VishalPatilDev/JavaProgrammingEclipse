package pac.demo.cc.thread;

public class UiThread implements Runnable {

	@Override
	public void run() {
		process();
		
	}
	void process() {
		System.out.println("P1");
	}

}
