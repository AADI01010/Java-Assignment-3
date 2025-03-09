package Section2;
class SharedBuffer {
    private int data;
    private boolean available = false;

    public synchronized void produce(int value) {
        while (available) { // Wait if data is already produced
            try { wait(); } catch (InterruptedException e) {}
        }
        data = value;
        available = true;
        System.out.println("Produced: " + data);
        notify(); // Notify consumer
    }

    public synchronized void consume() {
        while (!available) { // Wait if no data is available
            try { wait(); } catch (InterruptedException e) {}
        }
        System.out.println("Consumed: " + data);
        available = false;
        notify(); // Notify producer
    }
}

public class ProducerConsumerExample {
    public static void main(String[] args) {
        SharedBuffer buffer = new SharedBuffer();

        Thread producer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                buffer.produce(i);
                try { Thread.sleep(500); } catch (InterruptedException e) {}
            }
        });

        Thread consumer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                buffer.consume();
                try { Thread.sleep(1000); } catch (InterruptedException e) {}
            }
        });

        producer.start();
        consumer.start();
    }
}
