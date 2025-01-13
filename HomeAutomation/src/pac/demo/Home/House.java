package pac.demo.Home;

import java.util.*;

public class House {
	List<Rooms> rooms= new ArrayList();
	
	public House(List<Rooms> rooms) {
		super();
		this.rooms = rooms;
	}
	void addRoom(Rooms r) {
		rooms.add(r);
	}
	void removeRoom(Rooms r) {
		rooms.remove(r);
	}
	List<Rooms> getRooms(){
		return rooms;
	}
	

}
