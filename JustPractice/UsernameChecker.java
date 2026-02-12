import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UsernameChecker {

    public static void main(String[] args) {

        Set<String> users = new HashSet<>();
        users.add("rohan");
        users.add("admin");
        users.add("guest");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String input = sc.nextLine().toLowerCase();

        if (users.contains(input))
            System.out.println("Username already taken ❌");
        else
            System.out.println("Username available ✅");

        sc.close();
    }
}
