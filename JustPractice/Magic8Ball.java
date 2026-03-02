import java.util.Random;
import java.util.Scanner;

public class Magic8Ball {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        String[] responses = {
            "Yes, definitely ✅",
            "No, not at all ❌",
            "Ask again later 🤔",
            "Very likely 👍",
            "Uncertain 😐",
            "Absolutely! 🎉",
            "I don't think so 👎"
        };

        System.out.println("🎱 Welcome to Magic 8 Ball!");
        System.out.print("Ask your question: ");
        sc.nextLine(); // Just to simulate question input

        int index = rand.nextInt(responses.length);

        System.out.println("Magic 8 Ball says: " + responses[index]);

        sc.close();
    }
}