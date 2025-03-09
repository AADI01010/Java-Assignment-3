package Section2;
class NumberPrinter extends Thread {
    private volatile boolean running = true; // Flag to stop thread

    public void stopThread() {
        running = false; // Change flag to stop execution
    }
    @Override
    public void run() {
        for (int i = 1; i <= 100 && running; i++) {
            System.out.println(i);
            try { Thread.sleep(200); } catch (InterruptedException e) {}
        }
        System.out.println("Thread stopped.");
    }
}
public class StopThreadExample {
    public static void main(String[] args) {
        NumberPrinter thread = new NumberPrinter();
        thread.start();

        // Stop thread after 3 seconds
        try { Thread.sleep(3000); } catch (InterruptedException e) {}
        thread.stopThread();
    }
}
