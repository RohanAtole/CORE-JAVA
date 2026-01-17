import java.util.Scanner;

class ATM {
    private double balance = 5000;

    void checkBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Please collect your cash.");
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
}

public class ATMSimulator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ATM atm = new ATM();

        while (true) {
            System.out.println("\n1.Check Balance  2.Deposit  3.Withdraw  4.Exit");
            System.out.print("Choose: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> atm.checkBalance();
                case 2 -> {
                    System.out.print("Enter amount: ");
                    atm.deposit(sc.nextDouble());
                }
                case 3 -> {
                    System.out.print("Enter amount: ");
                    atm.withdraw(sc.nextDouble());
                }
                case 4 -> {
                    System.out.println("Thank you!");
                    System.exit(0);
                }
                default -> System.out.println("Invalid option.");
            }
        }
    }
}
