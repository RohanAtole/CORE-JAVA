public class SystemUptimeTracker {

    public static void main(String[] args) throws InterruptedException {

        long start = System.currentTimeMillis();

        System.out.println("Tracking uptime... Press Ctrl+C to stop.\n");

        while (true) {
            long now = System.currentTimeMillis();
            long seconds = (now - start) / 1000;

            System.out.print("\rUptime: " + seconds + " seconds");
            Thread.sleep(1000);
        }
    }
}
