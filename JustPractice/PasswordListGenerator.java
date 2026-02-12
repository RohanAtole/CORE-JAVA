import java.util.Random;

public class PasswordListGenerator {

    public static void main(String[] args) {

        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random rand = new Random();

        System.out.println("Generated Passwords:\n");

        for (int i = 0; i < 5; i++) {
            StringBuilder pass = new StringBuilder();

            for (int j = 0; j < 8; j++) {
                pass.append(chars.charAt(rand.nextInt(chars.length())));
            }

            System.out.println(pass);
        }
    }
}
