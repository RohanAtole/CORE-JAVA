import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToInteger {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        System.out.print("Enter Roman numeral: ");
        String roman = sc.nextLine().toUpperCase();

        int result = 0;

        for (int i = 0; i < roman.length(); i++) {
            int value = map.get(roman.charAt(i));

            if (i + 1 < roman.length() && value < map.get(roman.charAt(i + 1)))
                result -= value;
            else
                result += value;
        }

        System.out.println("Integer value = " + result);

        sc.close();
    }
}
