import java.util.Scanner;

public class HappyNumber {

    static int sumSquare(int n) {
        int sum = 0;
        while (n > 0) {
            int d = n % 10;
            sum += d * d;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int result = num;

        while (result != 1 && result != 4) {
            result = sumSquare(result);
        }

        if (result == 1)
            System.out.println("Happy Number ✅");
        else
            System.out.println("Not a Happy Number ❌");

        sc.close();
    }
}
