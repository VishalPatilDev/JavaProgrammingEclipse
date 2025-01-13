package pac.demo.home;
import java.util.Scanner;

class AC extends Device {
    private int temperature;

    public AC(String name) {
        super(name);
        this.temperature = 24; // Default temperature
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public void control() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter AC temperature (16 to 30): ");
        int temperature = scanner.nextInt();
        setTemperature(temperature);
        System.out.println("AC temperature set to: " + getTemperature());
    }

    @Override
    public String toString() {
        return super.toString() + ", Temperature: " + temperature;
    }
}
