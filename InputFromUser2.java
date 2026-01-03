package variablesdatatypes;

import java.util.Scanner;

public class InputFromUser2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Username: ");
        String username = scanner.nextLine();

        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        if (username.equals("admin") && password.equals("admin123")) {
            System.out.println("Login Successful. Welcome Admin.");
        } else {
            System.out.println("Invalid Username or Password.");
        }

        scanner.close();
    }
}
