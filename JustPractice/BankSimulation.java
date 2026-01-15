import java.util.Scanner;

class BankAccount {
    private double balance = 0;

    void deposit(double amount) {
        if (amount > 0) balance += amount;
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance)
            balance -= amount;
        else
            System.out.println("Invalid withdrawal!");
    }

    double getBalance() {
        return balance;
    }
}

public class BankSimulation {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1.Deposit 2.Withdraw 3.Check Balance 4.Exit");
            int ch = sc.nextInt();

            if (ch == 1) acc.deposit(sc.nextDouble());
            else if (ch == 2) acc.withdraw(sc.nextDouble());
            else if (ch == 3) System.out.println("Balance: ₹" + acc.getBalance());
            else break;
        }
        sc.close();
    }
}
