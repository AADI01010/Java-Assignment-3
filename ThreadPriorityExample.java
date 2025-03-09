class PriorityThread extends Thread {
    public PriorityThread(String name, int priority) {
        super(name); // Set thread name
        setPriority(priority); // Set thread priority
    }
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " is running with priority " + getPriority());
            try {
                Thread.sleep(500); // Sleep for 500ms to simulate work
            } catch (InterruptedException e) {
                System.out.println(getName() + " interrupted");
            }
        }
    }
}

public class ThreadPriorityExample {
    public static void main(String[] args) {
        // Creating three threads with different priorities
        PriorityThread t1 = new PriorityThread("Low Priority Thread", Thread.MIN_PRIORITY);   // Priority 1
        PriorityThread t2 = new PriorityThread("Medium Priority Thread", Thread.NORM_PRIORITY); // Priority 5
        PriorityThread t3 = new PriorityThread("High Priority Thread", Thread.MAX_PRIORITY);  // Priority 10
        // Start all threads
        t1.start();
        t2.start();
        t3.start();
    }
}
