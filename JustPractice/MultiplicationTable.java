import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("\nMultiplication Table of " + num + ":\n");

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " × " + i + " = " + (num * i));
        }

        sc.close();
    }
}
