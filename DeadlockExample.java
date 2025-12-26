class DeadlockExample {
    public static void main(String[] args) {
        final String resource1 = "Printer";
        final String resource2 = "Scanner";

        Thread t1 = new Thread(() -> {
            synchronized (resource1) {
                synchronized (resource2) {
                    System.out.println("Thread 1 acquired both resources");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (resource2) {
                synchronized (resource1) {
                    System.out.println("Thread 2 acquired both resources");
                }
            }
        });

        t1.start();
        t2.start();
    }
}
