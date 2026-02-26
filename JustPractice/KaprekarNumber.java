import java.util.Scanner;

public class KaprekarNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int square = num * num;
        String str = String.valueOf(square);

        int len = str.length();
        boolean isKaprekar = false;

        for (int i = 1; i < len; i++) {
            int left = Integer.parseInt(str.substring(0, i));
            int right = Integer.parseInt(str.substring(i));

            if (right != 0 && left + right == num) {
                isKaprekar = true;
                break;
            }
        }

        if (isKaprekar)
            System.out.println("Kaprekar Number ✅");
        else
            System.out.println("Not a Kaprekar Number ❌");

        sc.close();
    }
}
