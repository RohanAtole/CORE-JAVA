import java.util.Scanner;

public class PasswordStrengthChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        int score = 0;

        if (password.length() >= 8) score++;
        if (password.matches(".*[A-Z].*")) score++;
        if (password.matches(".*[a-z].*")) score++;
        if (password.matches(".*[0-9].*")) score++;
        if (password.matches(".*[!@#$%^&*()].*")) score++;

        System.out.println("Strength: " + getStrength(score));

        sc.close();
    }

    static String getStrength(int score) {
        return switch (score) {
            case 5 -> "Very Strong 💪";
            case 4 -> "Strong 🙂";
            case 3 -> "Medium 😐";
            case 2 -> "Weak 😕";
            default -> "Very Weak ❌";
        };
    }
}
