package pac.demo.home;

import java.util.*;

class Room {
    private String name;
    private ArrayList<Device> devices;

    public Room(String name) {
        this.name = name;
        this.devices = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addDevice(Device device) {
        devices.add(device);
    }

    public void displayDevices() {
        if (devices.isEmpty()) {
            System.out.println("No devices in this room.");
        } else {
            for (Device device : devices) {
                System.out.println(device);
            }
        }
    }

    public Device findDevice(String deviceName) {
        for (Device device : devices) {
            if (device.getName().equalsIgnoreCase(deviceName)) {
                return device;
            }
        }
        return null;
    }
}
