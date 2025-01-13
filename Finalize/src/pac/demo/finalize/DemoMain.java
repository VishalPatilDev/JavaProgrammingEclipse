package pac.demo.finalize;

public class DemoMain {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        Demo d2 = new Demo();

        // Making objects eligible for garbage collection
        d1 = null;
        d2 = null;

        // Requesting garbage collection
        System.gc();

        // Adding a small delay to ensure garbage collection
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main method completed.");
    }
}
