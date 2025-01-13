package pac.demo.Home;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		List<Devices> devices = new ArrayList();
		Devices l = new Light(50);
		devices.add(l);
		devices.add(new Fan(2));
		Rooms rooms = new Rooms("Kitchen",devices);
		House h = new House((List<Rooms>) rooms);
		h.addRoom(rooms);
	}
	
	
}
