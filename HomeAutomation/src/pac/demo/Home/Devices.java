package pac.demo.Home;

import java.sql.Time;

public abstract class Devices {
	int id;
	String name;
	boolean status;
	Time onTime;
	abstract void turnOn();
	abstract void turnOff();
	abstract String getStatus();
	abstract Time getTime();
}
