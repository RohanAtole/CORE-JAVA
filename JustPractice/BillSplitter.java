import java.util.Scanner;

public class BillSplitter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total bill amount: ");
        double total = sc.nextDouble();

        System.out.print("Enter number of people: ");
        int people = sc.nextInt();

        if (people <= 0) {
            System.out.println("Invalid number of people!");
        } else {
            double perPerson = total / people;
            System.out.printf("Each person should pay: ₹%.2f%n", perPerson);
        }

        sc.close();
    }
}
