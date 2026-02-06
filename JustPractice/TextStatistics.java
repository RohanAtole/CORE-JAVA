import java.util.Scanner;

public class TextStatistics {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a paragraph:");
        String text = sc.nextLine();

        int words = text.trim().isEmpty() ? 0 : text.trim().split("\\s+").length;
        int chars = text.length();
        int vowels = 0;

        for (char c : text.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) != -1)
                vowels++;
        }

        System.out.println("Words   : " + words);
        System.out.println("Chars   : " + chars);
        System.out.println("Vowels  : " + vowels);

        sc.close();
    }
}
