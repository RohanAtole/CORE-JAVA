import java.util.Random;

public class QuoteGenerator {

    public static void main(String[] args) {

        String[] quotes = {
            "Code is like humor. When you have to explain it, it’s bad.",
            "First, solve the problem. Then, write the code.",
            "Experience is the name everyone gives to their mistakes.",
            "Java is to JavaScript what car is to carpet."
        };

        Random rand = new Random();
        int index = rand.nextInt(quotes.length);

        System.out.println("Quote of the day:\n");
        System.out.println(quotes[index]);
    }
}
