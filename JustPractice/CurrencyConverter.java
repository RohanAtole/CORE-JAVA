import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. INR to USD");
        System.out.println("2. INR to EUR");
        System.out.println("3. USD to INR");

        System.out.print("Choose option: ");
        int choice = sc.nextInt();

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        double result = 0;

        switch (choice) {
            case 1 -> result = amount * 0.012;
            case 2 -> result = amount * 0.011;
            case 3 -> result = amount * 83;
            default -> {
                System.out.println("Invalid choice");
                return;
            }
        }

        System.out.println("Converted Amount = " + result);
        sc.close();
    }
}
