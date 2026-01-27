import java.util.Scanner;

public class PasswordCrackerSim {

    public static void main(String[] args) {

        String[] commonPasswords = {
            "123456", "password", "admin", "qwerty", "welcome", "letmein"
        };

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password to test: ");
        String input = sc.nextLine();

        boolean cracked = false;

        for (String pwd : commonPasswords) {
            if (pwd.equals(input)) {
                cracked = true;
                break;
            }
        }

        if (cracked)
            System.out.println("Password is WEAK ❌ (found in common list)");
        else
            System.out.println("Password is not in common list ✅");

        sc.close();
    }
}
