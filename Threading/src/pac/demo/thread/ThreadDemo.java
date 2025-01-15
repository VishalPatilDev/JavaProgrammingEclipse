package pac.demo.thread;
public class ThreadDemo  {
	public static void main(String[] args) {
		
//		Runnable r1 = new ThreadDemo();
//		Thread t1 = new Thread(r1);
		Thread t1 = new Thread(new UiThread());
		
		
		
		Thread t2 = new Thread(new RemoteThread());
		t1.setName("UiThread");
		t2.setName("RemoteThread");
		
		
		t1.start(); //this will register t1 thread to scheduler
		t2.start(); //this will register t2 thread to schedule
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		process5();
	}
	public static void process5() {
		System.out.println("P5");
	}
	
	
	

	
	

}
