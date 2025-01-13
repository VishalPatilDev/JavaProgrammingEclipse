package pac.synchronization.example;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        Thread t1 = new Thread(() -> account.withdraw(500));
        Thread t2 = new Thread(() -> account.deposit(300));

        t1.start();
        t2.start();
    }
}