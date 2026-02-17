import java.util.Scanner;

public class WordCounterManual {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String text = sc.nextLine().trim();

        int count = 0;

        if (!text.isEmpty()) {
            count = 1;
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == ' ')
                    count++;
            }
        }

        System.out.println("Total words = " + count);

        sc.close();
    }
}
