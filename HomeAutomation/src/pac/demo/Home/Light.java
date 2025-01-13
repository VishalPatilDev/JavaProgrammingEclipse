package pac.demo.Home;

import java.sql.Time;

public class Light extends Devices{
	int brightness;
	

	public Light(int brightness) {
		super();
		this.brightness = brightness;
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
	
	void changeBrightness(int b) {
		this.brightness=b;
	}

}
