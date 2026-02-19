import java.util.Scanner;

public class CharacterFrequency {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine().toLowerCase();

        int[] freq = new int[26];

        for (char ch : text.toCharArray()) {
            if (ch >= 'a' && ch <= 'z')
                freq[ch - 'a']++;
        }

        System.out.println("\nCharacter Frequencies:");
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0)
                System.out.println((char)(i + 'a') + " : " + freq[i]);
        }

        sc.close();
    }
}
