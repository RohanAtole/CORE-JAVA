import java.util.*;

class Book {
    int id;
    String title;
    boolean issued;

    Book(int id, String title) {
        this.id = id;
        this.title = title;
        this.issued = false;
    }

    public String toString() {
        return id + " | " + title + " | " + (issued ? "Issued" : "Available");
    }
}

public class LibrarySystem {

    static ArrayList<Book> books = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        books.add(new Book(1, "Clean Code"));
        books.add(new Book(2, "Java Complete Reference"));
        books.add(new Book(3, "Design Patterns"));

        while (true) {
            System.out.println("\n1.View Books  2.Issue Book  3.Return Book  4.Exit");
            System.out.print("Choose: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1 -> viewBooks();
                case 2 -> issueBook();
                case 3 -> returnBook();
                case 4 -> System.exit(0);
                default -> System.out.println("Invalid choice!");
            }
        }
    }

    static void viewBooks() {
        books.forEach(System.out::println);
    }

    static void issueBook() {
        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();

        for (Book b : books) {
            if (b.id == id && !b.issued) {
                b.issued = true;
                System.out.println("Book issued successfully.");
                return;
            }
        }
        System.out.println("Book not available.");
    }

    static void returnBook() {
        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();

        for (Book b : books) {
            if (b.id == id && b.issued) {
                b.issued = false;
                System.out.println("Book returned successfully.");
                return;
            }
        }
        System.out.println("Invalid return.");
    }
}
