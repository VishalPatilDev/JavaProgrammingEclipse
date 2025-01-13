package pac.demo.home;

class Light extends Device {
    private boolean isOn;

    public Light(String name) {
        super(name);
        this.isOn = false; // Default state
    }

    public void toggle() {
        isOn = !isOn;
    }

    public boolean isOn() {
        return isOn;
    }

    @Override
    public void control() {
        toggle();
        System.out.println("Light is now " + (isOn ? "ON" : "OFF"));
    }

    @Override
    public String toString() {
        return super.toString() + ", State: " + (isOn ? "ON" : "OFF");
    }
}
