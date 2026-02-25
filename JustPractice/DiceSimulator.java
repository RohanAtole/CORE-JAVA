import java.util.Random;
import java.util.Scanner;

public class DiceSimulator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Press Enter to roll dice...");
        sc.nextLine();

        int dice = rand.nextInt(6) + 1;

        System.out.println("🎲 Dice Result: " + dice);

        sc.close();
    }
}
