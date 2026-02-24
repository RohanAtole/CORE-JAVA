import java.util.Scanner;

public class AutoCapitalize {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String text = sc.nextLine();

        String[] words = text.split(" ");
        String result = "";

        for (String w : words) {
            result += Character.toUpperCase(w.charAt(0))
                    + w.substring(1) + " ";
        }

        System.out.println("Capitalized: " + result.trim());

        sc.close();
    }
}
