import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {

    static final String LOWER = "abcdefghijklmnopqrstuvwxyz";
    static final String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    static final String NUMBERS = "0123456789";
    static final String SYMBOLS = "!@#$%^&*";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password length: ");
        int length = sc.nextInt();

        String allChars = LOWER + UPPER + NUMBERS + SYMBOLS;
        Random rand = new Random();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            password.append(allChars.charAt(rand.nextInt(allChars.length())));
        }

        System.out.println("Generated Password: " + password);
        sc.close();
    }
}
