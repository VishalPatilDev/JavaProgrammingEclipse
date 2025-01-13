package pac.demo.Home;

import java.sql.Time;

public class AC extends Devices{
	int speed;
	double temp;
	

	public AC(int speed, double temp) {
		super();
		this.speed = speed;
		this.temp = temp;
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
	
	void changeTemp(double t) {
		this.temp=t;
	}
	void changeSpeed(int fs) {
		this.speed=fs;
	}

}
