import java.util.Random;

public class PinGenerator {

    public static void main(String[] args) {

        Random rand = new Random();
        int pin = 1000 + rand.nextInt(9000);

        System.out.println("Generated 4-digit PIN: " + pin);
    }
}
