import java.util.*;

class Expense {
    String category;
    double amount;

    Expense(String category, double amount) {
        this.category = category;
        this.amount = amount;
    }
}

public class ExpenseTracker {

    static ArrayList<Expense> expenses = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n1.Add Expense  2.View Total  3.Category Summary  4.Exit");
            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1 -> addExpense();
                case 2 -> viewTotal();
                case 3 -> categorySummary();
                case 4 -> System.exit(0);
            }
        }
    }

    static void addExpense() {
        System.out.print("Category: ");
        String cat = sc.nextLine();
        System.out.print("Amount: ");
        double amt = sc.nextDouble();

        expenses.add(new Expense(cat, amt));
        System.out.println("Expense added.");
    }

    static void viewTotal() {
        double total = 0;
        for (Expense e : expenses) total += e.amount;
        System.out.println("Total Expense = ₹" + total);
    }

    static void categorySummary() {
        Map<String, Double> map = new HashMap<>();

        for (Expense e : expenses)
            map.put(e.category, map.getOrDefault(e.category, 0.0) + e.amount);

        System.out.println("\nCategory Summary:");
        map.forEach((k, v) -> System.out.println(k + " : ₹" + v));
    }
}
