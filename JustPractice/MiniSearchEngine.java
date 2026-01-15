import java.util.*;

public class MiniSearchEngine {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = sc.nextLine().toLowerCase();

        String[] words = text.split("\\W+");
        Map<String, Integer> freq = new HashMap<>();

        for (String word : words)
            freq.put(word, freq.getOrDefault(word, 0) + 1);

        System.out.println("\nWord Frequencies:");
        freq.forEach((k, v) -> System.out.println(k + " : " + v));

        sc.close();
    }
}
