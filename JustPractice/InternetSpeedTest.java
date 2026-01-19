import java.util.Random;

public class InternetSpeedTest {

    public static void main(String[] args) throws InterruptedException {
        Random rand = new Random();

        System.out.println("Starting speed test...\n");

        for (int i = 0; i <= 100; i += 10) {
            System.out.println("Testing... " + i + "%");
            Thread.sleep(400);
        }

        double speed = 10 + (50 - 10) * rand.nextDouble();
        System.out.printf("\nDownload Speed: %.2f Mbps\n", speed);

        if (speed > 30)
            System.out.println("Connection: Excellent 🚀");
        else if (speed > 15)
            System.out.println("Connection: Good 🙂");
        else
            System.out.println("Connection: Slow 😐");
    }
}
