class Resource {}

public class DeadlockDemo {

    static Resource r1 = new Resource();
    static Resource r2 = new Resource();

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            synchronized (r1) {
                System.out.println("Thread 1 locked Resource 1");
                try { Thread.sleep(100); } catch (Exception e) {}
                synchronized (r2) {
                    System.out.println("Thread 1 locked Resource 2");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (r2) {
                System.out.println("Thread 2 locked Resource 2");
                try { Thread.sleep(100); } catch (Exception e) {}
                synchronized (r1) {
                    System.out.println("Thread 2 locked Resource 1");
                }
            }
        });

        t1.start();
        t2.start();
    }
}
