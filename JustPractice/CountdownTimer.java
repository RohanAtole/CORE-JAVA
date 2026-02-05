import java.util.Scanner;

public class CountdownTimer {

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter countdown seconds: ");
        int seconds = sc.nextInt();

        for (int i = seconds; i >= 0; i--) {
            System.out.print("\rTime left: " + i + "s ");
            Thread.sleep(1000);
        }

        System.out.println("\n⏰ Time's up!");
        sc.close();
    }
}
