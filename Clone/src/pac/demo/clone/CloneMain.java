package pac.demo.clone;

public class CloneMain {
    public static void main(String[] args) {
        try {
            CloneDemo d1 = new CloneDemo(1, "Original");
            CloneDemo d2 = (CloneDemo) d1.clone();

            System.out.println("Original Object: " + d1);
            System.out.println("Cloned Object: " + d2);

            // Modify the cloned object
            d2.name = "Cloned";
            System.out.println("\nAfter modification:");
            System.out.println("Original Object: " + d1);
            System.out.println("Cloned Object: " + d2);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
