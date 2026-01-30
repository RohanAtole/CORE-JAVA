public class RateLimiter {

    private static final int LIMIT = 5;
    private static int count = 0;
    private static long windowStart = System.currentTimeMillis();

    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Request " + i + ": " + (allow() ? "ALLOWED" : "BLOCKED"));
            Thread.sleep(500);
        }
    }

    static boolean allow() {
        long now = System.currentTimeMillis();
        if (now - windowStart > 60_000) {
            windowStart = now;
            count = 0;
        }
        if (count < LIMIT) {
            count++;
            return true;
        }
        return false;
    }
}
