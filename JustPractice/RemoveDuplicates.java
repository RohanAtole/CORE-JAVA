import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicates {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String input = sc.nextLine();

        Set<Character> set = new LinkedHashSet<>();

        for (char c : input.toCharArray()) {
            set.add(c);
        }

        System.out.print("After removing duplicates: ");
        for (char c : set)
            System.out.print(c);

        sc.close();
    }
}
