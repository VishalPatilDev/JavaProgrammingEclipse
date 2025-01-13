package pac.demo.thread;

public class ThreadDemo extends Thread {
	public static void main(String[] args) {
		Thread t1 = new ThreadDemo();
		t1.setName("UiThread");
		
		Thread t2 = new ThreadDemo();
		t2.setName("RemoteThread");
		
		t1.start(); //this will register t1 thread to scheduler
		t2.start(); //this will register t2 thread to scheduler
	}
	
	public void runThis() {
		process1();
		process2();
		process3();
		process4();
	}
	
	public void process1() {
		System.out.println("P1");
	}
	public void process2() {
		System.out.println("P2");
	}
	public void process3() {
		System.out.println("P3");
	}
	public void process4() {
		System.out.println("P4");
	}

	@Override
	public void run() {
//		System.out.println(Thread.currentThread().getName());
		if(Thread.currentThread().getName().equals("UiThread")) {
			process1();
			process2();
		}
		else {
			process3();
			process4();
		}
		
		
		
		
	}
	
	

}
