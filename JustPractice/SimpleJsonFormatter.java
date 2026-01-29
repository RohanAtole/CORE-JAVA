import java.util.Scanner;

public class SimpleJsonFormatter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter city: ");
        sc.nextLine();
        String city = sc.nextLine();

        String json = "{\n" +
                      "  \"name\": \"" + name + "\",\n" +
                      "  \"age\": " + age + ",\n" +
                      "  \"city\": \"" + city + "\"\n" +
                      "}";

        System.out.println("\nGenerated JSON:");
        System.out.println(json);

        sc.close();
    }
}
