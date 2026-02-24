import java.util.Random;

public class OTPGenerator {

    public static void main(String[] args) {

        Random rand = new Random();
        int otp = 100000 + rand.nextInt(900000);

        System.out.println("Generated OTP: " + otp);
    }
}
