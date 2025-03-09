// Creating a thread by extending the Thread class
class NumberThread extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println(Thread.currentThread().getName()+" "+i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }
}

public class ThreadTest1 {
    public static void main(String[] args) {
        NumberThread t1 = new NumberThread();
        t1.start(); // Start the thread
    }
}
