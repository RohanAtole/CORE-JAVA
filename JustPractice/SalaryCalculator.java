import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        double basicSalary = sc.nextDouble();

        double hra = basicSalary * 0.20;
        double da = basicSalary * 0.10;
        double totalSalary = basicSalary + hra + da;

        System.out.println("\n--- Salary Details ---");
        System.out.println("Employee Name: " + name);
        System.out.println("Total Salary: " + totalSalary);

        sc.close();
    }
}
