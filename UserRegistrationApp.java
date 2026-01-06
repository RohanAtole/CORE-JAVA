import java.util.Scanner;

public class UserRegistrationApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== User Registration ===");

        System.out.print("Enter Full Name: ");
        String fullName = scanner.nextLine();

        System.out.print("Enter Email: ");
        String email = scanner.nextLine();

        System.out.print("Enter Age: ");
        int age = scanner.nextInt();

        System.out.println("\n--- Registered User Details ---");
        System.out.println("Name  : " + fullName);
        System.out.println("Email : " + email);
        System.out.println("Age   : " + age);

        scanner.close();
    }
}
