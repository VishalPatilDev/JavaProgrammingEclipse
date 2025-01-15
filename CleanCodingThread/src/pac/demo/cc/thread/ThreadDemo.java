package pac.demo.cc.thread;

public class ThreadDemo {

	public static void main(String[] args) {
		RemoteThread r = new RemoteThread();
		Thread t1 = new Thread(new UiThread());
		Thread t2 = new Thread(r);
		t1.start();
		t2.start();
		process5();

	}
	public static void process5() {
		System.out.println("P5");
	}

}
