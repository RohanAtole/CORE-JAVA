import java.util.Scanner;

public class ISBNValidator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 10-digit ISBN: ");
        String isbn = sc.nextLine();

        if (isbn.length() != 10) {
            System.out.println("Invalid ISBN length ❌");
            return;
        }

        int sum = 0;

        for (int i = 0; i < 10; i++) {
            char ch = isbn.charAt(i);

            if (!Character.isDigit(ch)) {
                System.out.println("Invalid ISBN ❌");
                return;
            }

            sum += (ch - '0') * (10 - i);
        }

        if (sum % 11 == 0)
            System.out.println("Valid ISBN ✅");
        else
            System.out.println("Invalid ISBN ❌");

        sc.close();
    }
}
