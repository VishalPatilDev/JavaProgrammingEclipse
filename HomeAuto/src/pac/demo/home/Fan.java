package pac.demo.home;

import java.util.Scanner;



class Fan extends Device {
    private int speed;

    public Fan(String name) {
        super(name);
        this.speed = 0; // Default speed
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public void control() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter fan speed (0 to 5): ");
        int speed = scanner.nextInt();
        setSpeed(speed);
        System.out.println("Fan speed set to: " + getSpeed());
    }

    @Override
    public String toString() {
        return super.toString() + ", Speed: " + speed;
    }
}

