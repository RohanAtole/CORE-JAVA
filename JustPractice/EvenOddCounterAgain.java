import java.util.Scanner;

public class EvenOddCounterAgain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers? ");
        int n = sc.nextInt();

        int even = 0, odd = 0;

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();

            if (num % 2 == 0)
                even++;
            else
                odd++;
        }

        System.out.println("Even count: " + even);
        System.out.println("Odd count : " + odd);

        sc.close();
    }
}
