public class ThrowsExample {

    static void calculate() throws InterruptedException {
        Thread.sleep(1000);  // may throw checked exception
        System.out.println("Calculation Completed!");
    }

    public static void main(String[] args) {
        try {
            calculate();
        } catch (InterruptedException e) {
            System.out.println("Error: Operation was interrupted!");
        }
    }
}
