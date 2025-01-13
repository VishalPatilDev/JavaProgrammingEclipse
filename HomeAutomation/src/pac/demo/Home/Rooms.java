package pac.demo.Home;

import java.util.*;

public class Rooms {
	String name;
	
	public Rooms(String name, List<Devices> devices) {
		super();
		this.name = name;
		this.devices = devices;
	}
	List<Devices> devices =new ArrayList();
	void addDevice(Devices d) {
		devices.add(d);
	}
	void removeDevice(Devices d) {
		devices.remove(d);
	}
	List<Devices> getDevices(){
		return devices;
	}
	

}
