public class BasicException {
    public static void main(String[] args) {
        try {
            int a = 10 / 0; // ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide a number by zero!");
        }
        System.out.println("Program continues...");
    }
}
