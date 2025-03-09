class DaemonThread extends Thread {
    @Override
    public void run() {
        try {
            while (true) {
                System.out.println("Daemon Thread Running");
                Thread.sleep(1000); // 1-second delay
            }
        } catch (InterruptedException e) {
            System.out.println("Daemon Thread Interrupted");
        }
    }
}
public class DaemonThreadExample {
    public static void main(String[] args) {
        DaemonThread daemon = new DaemonThread();
        daemon.setDaemon(true); // Setting the thread as daemon
        daemon.start();
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Main Thread Running");
                Thread.sleep(2000); // 2-second delay
            }
        } catch (InterruptedException e) {
            System.out.println("Main Thread Interrupted");
        }
        System.out.println("Main Thread Finished");
        // Daemon thread will stop as soon as the main thread ends
    }
}
