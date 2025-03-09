// Creating a thread by implementing the Runnable interface
class RunnableInterface implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello, World!");
        }
    }
}

public class ThreadTest2 {
    public static void main(String[] args) {
        RunnableInterface r1 = new RunnableInterface();
        Thread t1 = new Thread(r1); // Create a Thread and pass Runnable instance
        t1.start(); // Start the thread
    }
}
