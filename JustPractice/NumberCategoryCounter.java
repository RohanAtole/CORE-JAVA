import java.util.Scanner;

public class NumberCategoryCounter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers? ");
        int n = sc.nextInt();

        int positive = 0, negative = 0, zero = 0;

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();

            if (num > 0)
                positive++;
            else if (num < 0)
                negative++;
            else
                zero++;
        }

        System.out.println("Positive: " + positive);
        System.out.println("Negative: " + negative);
        System.out.println("Zero: " + zero);

        sc.close();
    }
}
