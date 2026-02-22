import java.util.Scanner;

public class PinLoginSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int correctPin = 1234;
        int attempts = 3;

        while (attempts > 0) {
            System.out.print("Enter PIN: ");
            int pin = sc.nextInt();

            if (pin == correctPin) {
                System.out.println("Login Successful ✅");
                return;
            } else {
                attempts--;
                System.out.println("Wrong PIN! Attempts left: " + attempts);
            }
        }

        System.out.println("Account Locked ❌");
        sc.close();
    }
}
