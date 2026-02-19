import java.util.Scanner;

public class ElectricityBill {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter units consumed: ");
        int units = sc.nextInt();

        double bill;

        if (units <= 100)
            bill = units * 5;
        else if (units <= 300)
            bill = (100 * 5) + (units - 100) * 7;
        else
            bill = (100 * 5) + (200 * 7) + (units - 300) * 10;

        System.out.println("Total Bill = ₹" + bill);

        sc.close();
    }
}
