import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PangramChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String text = sc.nextLine().toLowerCase();

        Set<Character> letters = new HashSet<>();

        for (char c : text.toCharArray()) {
            if (c >= 'a' && c <= 'z')
                letters.add(c);
        }

        if (letters.size() == 26)
            System.out.println("Pangram ✅");
        else
            System.out.println("Not a Pangram ❌");

        sc.close();
    }
}
