package pac.demo.home;
import java.util.ArrayList;
import java.util.Scanner;


abstract class Device {
    private String name;

    public Device(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void control();

    @Override
    public String toString() {
        return "Device: " + name;
    }
}

