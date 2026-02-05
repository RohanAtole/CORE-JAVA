import java.util.*;

public class UsernameGenerator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Enter base username: ");
        String base = sc.nextLine();

        Set<String> usernames = new HashSet<>();

        for (int i = 0; i < 5; i++) {
            String user = base + rand.nextInt(1000);
            usernames.add(user);
        }

        System.out.println("\nSuggested Usernames:");
        usernames.forEach(System.out::println);

        sc.close();
    }
}
