import java.util.Scanner;

public class ATM {
    static int balance = 10000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            System.out.print("Choose option: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Balance: ₹" + balance);
                    break;

                case 2:
                    System.out.print("Enter amount: ");
                    balance += sc.nextInt();
                    System.out.println("Deposited successfully.");
                    break;

                case 3:
                    System.out.print("Enter amount: ");
                    int amt = sc.nextInt();
                    if (amt <= balance) {
                        balance -= amt;
                        System.out.println("Withdraw successful.");
                    } else {
                        System.out.println("Insufficient balance!");
                    }
                    break;

                case 4:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);
    }
}
