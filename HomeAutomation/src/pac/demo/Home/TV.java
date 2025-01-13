package pac.demo.Home;

import java.sql.Time;

public class TV extends Devices{
	int volume;
	int channelNo;
	

	public TV(int volume, int channelNo) {
		super();
		this.volume = volume;
		this.channelNo = channelNo;
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
	
	void setVolume(int v) {
		this.volume=v;
		
	}
	void changeChannel(int cn) {
		this.channelNo=cn;
	}

}
