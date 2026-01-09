class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

public class BankAccount {
    static double balance = 3000;

    public static void withdraw(double amount) throws InsufficientBalanceException {
        if (balance - amount < 2000) {
            throw new InsufficientBalanceException("Minimum balance of 2000 required");
        }
        balance -= amount;
        System.out.println("Withdrawal successful. Balance: " + balance);
    }

    public static void main(String[] args) {
        try {
            withdraw(1500);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
