import java.util.Scanner;

public class SimpleStopwatch {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Press ENTER to start...");
        sc.nextLine();

        long start = System.currentTimeMillis();

        System.out.println("Press ENTER to stop...");
        sc.nextLine();

        long end = System.currentTimeMillis();

        double seconds = (end - start) / 1000.0;

        System.out.println("Elapsed time: " + seconds + " seconds");

        sc.close();
    }
}