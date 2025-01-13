package pac.demo.home;

class Shower extends Device {
    private boolean isRunning;

    public Shower(String name) {
        super(name);
        this.isRunning = false; // Default state
    }

    public void toggle() {
        isRunning = !isRunning;
    }

    public boolean isRunning() {
        return isRunning;
    }

    @Override
    public void control() {
        toggle();
        System.out.println("Shower is now " + (isRunning ? "Running" : "Stopped"));
    }

    @Override
    public String toString() {
        return super.toString() + ", State: " + (isRunning ? "Running" : "Stopped");
    }
}
