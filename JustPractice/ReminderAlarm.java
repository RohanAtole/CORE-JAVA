import java.awt.Toolkit;
import java.util.Scanner;

public class ReminderAlarm {

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Set reminder after seconds: ");
        int sec = sc.nextInt();

        System.out.println("Reminder set...");

        Thread.sleep(sec * 1000);

        Toolkit.getDefaultToolkit().beep();
        System.out.println("🔔 Reminder!");

        sc.close();
    }
}
