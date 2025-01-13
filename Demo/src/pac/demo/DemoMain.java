package pac.demo;

public class DemoMain {
	public static void main(String[] args) {
		Demo d = new Demo(1,"v",18);
		Demo d2  = new Demo(1,"v",18);
		System.out.println(d);
		if(d.equals(d2)) {
			System.out.println("Same");
		}
		else {
			System.out.println("Different");
		}
		System.out.println(d.hashCode());
		System.out.println(d2.hashCode());
	}
	
}
