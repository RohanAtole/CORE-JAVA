import java.util.Scanner;

public class SimpleQuizGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;

        System.out.println("=== Java Mini Quiz ===");

        System.out.println("1) Java is platform independent? (yes/no)");
        if (sc.nextLine().equalsIgnoreCase("yes")) score++;

        System.out.println("2) Size of int in Java is 4 bytes? (yes/no)");
        if (sc.nextLine().equalsIgnoreCase("yes")) score++;

        System.out.println("3) Java supports multiple inheritance with classes? (yes/no)");
        if (sc.nextLine().equalsIgnoreCase("no")) score++;

        System.out.println("\nYour Score: " + score + "/3");

        sc.close();
    }
}
