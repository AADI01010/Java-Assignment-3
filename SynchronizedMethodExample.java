package Section2;
class BankAccount {
    private int balance = 1000;

    // Synchronized method to update balance safely
    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println(Thread.currentThread().getName() + " deposited " + amount +
                ", Updated Balance: " + balance);
    }
}
public class SynchronizedMethodExample {
    public static void main(String[] args) {
        bankAccount account = new bankAccount();
        // Two threads trying to deposit money
        Thread t1 = new Thread(() -> account.deposit(500), "Thread 1");
        Thread t2 = new Thread(() -> account.deposit(700), "Thread 2");
        t1.start();
        t2.start();
    }
}
