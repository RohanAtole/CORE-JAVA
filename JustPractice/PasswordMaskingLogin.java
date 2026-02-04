import java.util.Scanner;

public class PasswordMaskingLogin {

    static final String SAVED_PASSWORD = "java@123";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password: ");
        String input = sc.nextLine();

        String masked = "*".repeat(input.length());
        System.out.println("Entered: " + masked);

        if (input.equals(SAVED_PASSWORD))
            System.out.println("Login successful ✅");
        else
            System.out.println("Invalid password ❌");

        sc.close();
    }
}
