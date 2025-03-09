class Sleep extends Thread {
    private final int sleepTime; // Variable to store sleep duration
    // Constructor to set sleep time
    public Sleep(String name, int sleepTime) {
        super(name); // Set thread name
        this.sleepTime = sleepTime;
    }
    @Override
    public void run() {
        try {
            while (true) {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(sleepTime); // Sleep based on thread-specific interval
            }
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " interrupted");
        }
    }
}

public class ThreadTest3 {
    public static void main(String[] args) {
        Sleep t1 = new Sleep("Thread 1", 1000); // 1-second delay
        Sleep t2 = new Sleep("Thread 2", 2000); // 2-second delay
        t1.start();
        t2.start();
    }
}
