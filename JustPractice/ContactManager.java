import java.util.*;

public class ContactManager {

    static Map<String, String> contacts = new HashMap<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n1.Add  2.View  3.Delete  4.Exit");
            System.out.print("Choose: ");
            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1 -> addContact();
                case 2 -> viewContacts();
                case 3 -> deleteContact();
                case 4 -> System.exit(0);
                default -> System.out.println("Invalid choice");
            }
        }
    }

    static void addContact() {
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Phone: ");
        String phone = sc.nextLine();
        contacts.put(name, phone);
        System.out.println("Contact saved.");
    }

    static void viewContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts.");
            return;
        }
        contacts.forEach((k, v) -> System.out.println(k + " : " + v));
    }

    static void deleteContact() {
        System.out.print("Enter name to delete: ");
        String name = sc.nextLine();
        contacts.remove(name);
        System.out.println("Deleted if existed.");
    }
}
