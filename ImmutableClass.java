final class Employee {
    private final int id;
    private final String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() { return id; }
    public String getName() { return name; }
}

public class ImmutableClass {
    public static void main(String[] args) {
        Employee e = new Employee(1, "Rohan");
        System.out.println(e.getId() + " " + e.getName());
    }
}
