import java.util.*;

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}

public class SortEmployeeBySalary {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1, "Rohan", 45000));
        employees.add(new Employee(2, "Amit", 55000));
        employees.add(new Employee(3, "Sneha", 40000));

        employees.sort(Comparator.comparingDouble(e -> e.salary));

        for (Employee e : employees) {
            System.out.println(e.id + " " + e.name + " " + e.salary);
        }
    }
}
