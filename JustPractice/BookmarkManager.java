import java.util.*;

public class BookmarkManager {

    static Map<String, String> bookmarks = new HashMap<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n1.Add Bookmark  2.View Bookmarks  3.Delete Bookmark  4.Exit");
            System.out.print("Choose: ");
            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1 -> addBookmark();
                case 2 -> viewBookmarks();
                case 3 -> deleteBookmark();
                case 4 -> System.exit(0);
                default -> System.out.println("Invalid choice");
            }
        }
    }

    static void addBookmark() {
        System.out.print("Enter site name: ");
        String name = sc.nextLine();
        System.out.print("Enter URL: ");
        String url = sc.nextLine();

        bookmarks.put(name, url);
        System.out.println("Bookmark saved.");
    }

    static void viewBookmarks() {
        if (bookmarks.isEmpty()) {
            System.out.println("No bookmarks found.");
            return;
        }

        bookmarks.forEach((k, v) -> System.out.println(k + " -> " + v));
    }

    static void deleteBookmark() {
        System.out.print("Enter site name to delete: ");
        String name = sc.nextLine();
        bookmarks.remove(name);
        System.out.println("Deleted if existed.");
    }
}
