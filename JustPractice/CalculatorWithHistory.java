import java.util.*;

public class CalculatorWithHistory {

    static List<String> history = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n1.Add  2.Subtract  3.Multiply  4.Divide  5.History  6.Exit");
            int ch = sc.nextInt();

            if (ch >= 1 && ch <= 4) {
                System.out.print("Enter two numbers: ");
                double a = sc.nextDouble();
                double b = sc.nextDouble();
                calculate(ch, a, b);
            } else if (ch == 5) {
                showHistory();
            } else if (ch == 6) {
                break;
            }
        }
    }

    static void calculate(int ch, double a, double b) {
        double res = 0;
        String op = "";

        switch (ch) {
            case 1 -> { res = a + b; op = "+"; }
            case 2 -> { res = a - b; op = "-"; }
            case 3 -> { res = a * b; op = "*"; }
            case 4 -> {
                if (b == 0) {
                    System.out.println("Cannot divide by zero!");
                    return;
                }
                res = a / b;
                op = "/";
            }
        }

        String record = a + " " + op + " " + b + " = " + res;
        history.add(record);
        System.out.println(record);
    }

    static void showHistory() {
        if (history.isEmpty()) {
            System.out.println("No history yet.");
            return;
        }
        System.out.println("--- Calculation History ---");
        history.forEach(System.out::println);
    }
}
