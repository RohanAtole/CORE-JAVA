import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String input = "swiss";
        Map<Character, Integer> countMap = new HashMap<>();

        for (char ch : input.toCharArray()) {
            countMap.put(ch, countMap.getOrDefault(ch, 0) + 1);
        }

        for (char ch : input.toCharArray()) {
            if (countMap.get(ch) == 1) {
                System.out.println("First non-repeating character: " + ch);
                return;
            }
        }

        System.out.println("No non-repeating character found");
    }
}
