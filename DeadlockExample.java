package Section2;
class Resource {
    final String name;

    public Resource(String name) {
        this.name = name;
    }
}
public class DeadlockExample {
    public static void main(String[] args) {
        Resource resource1 = new Resource("Resource 1");
        Resource resource2 = new Resource("Resource 2");

        Thread t1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println(Thread.currentThread().getName() + " locked " + resource1.name);
                try { Thread.sleep(100); } catch (InterruptedException e) {}
                synchronized (resource2) {
                    System.out.println(Thread.currentThread().getName() + " locked " + resource2.name);
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (resource2) {
                System.out.println(Thread.currentThread().getName() + " locked " + resource2.name);
                try { Thread.sleep(100); } catch (InterruptedException e) {}
                synchronized (resource1) {
                    System.out.println(Thread.currentThread().getName() + " locked " + resource1.name);
                }
            }
        });

        t1.start();
        t2.start();
    }
}
