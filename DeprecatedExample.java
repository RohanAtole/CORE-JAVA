class Calculator {

    @Deprecated
    void add(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }
}

public class DeprecatedExample {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.add(10, 20);
    }
}
