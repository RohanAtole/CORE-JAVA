import java.util.Scanner;

public class UserLoginValidation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Dummy credentials (can be replaced with DB later)
        String storedUsername = "admin";
        String storedPassword = "admin123";

        System.out.print("Enter Username: ");
        String username = scanner.nextLine();

        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        if (username.equals(storedUsername) && password.equals(storedPassword)) {
            System.out.println("Login Successful!");
        } else {
            System.out.println("Invalid Username or Password.");
        }

        scanner.close();
    }
}
