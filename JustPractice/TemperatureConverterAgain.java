import java.util.Scanner;

public class TemperatureConverterAgain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Celsius → Fahrenheit");
        System.out.println("2. Fahrenheit → Celsius");
        System.out.print("Choose: ");
        int ch = sc.nextInt();

        System.out.print("Enter temperature: ");
        double temp = sc.nextDouble();

        if (ch == 1) {
            double f = (temp * 9 / 5) + 32;
            System.out.println("Fahrenheit = " + f);
        } else if (ch == 2) {
            double c = (temp - 32) * 5 / 9;
            System.out.println("Celsius = " + c);
        } else {
            System.out.println("Invalid choice");
        }

        sc.close();
    }
}
