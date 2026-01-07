import java.util.Scanner;

class Employee {
    int id;
    String name;
    double salary;

    void inputDetails(Scanner sc) {
        System.out.print("Enter ID: ");
        id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Salary: ");
        salary = sc.nextDouble();
    }

    void displayDetails() {
        System.out.println("\nEmployee Details");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

public class EmployeeManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();

        emp.inputDetails(sc);
        emp.displayDetails();

        sc.close();
    }
}
