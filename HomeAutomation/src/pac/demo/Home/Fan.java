package pac.demo.Home;

import java.sql.Time;

public class Fan extends Devices {
	int speed;
	
	public Fan(int speed) {
		super();
		this.speed = speed;
	}

	@Override
	void turnOn() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void turnOff() {
		// TODO Auto-generated method stub
		
	}

	@Override
	String getStatus() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Time getTime() {
		// TODO Auto-generated method stub
		return null;
	}
	
	void speed(int s) {
		this.speed=s;
		System.out.println("Current Speed is : "+s);
	}
	

}
