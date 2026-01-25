import java.util.Random;
import java.util.Scanner;

public class OTPSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int otp = 100000 + rand.nextInt(900000);

        System.out.println("Generated OTP: " + otp + " (for demo)");

        System.out.print("Enter OTP: ");
        int userOtp = sc.nextInt();

        if (otp == userOtp)
            System.out.println("OTP Verified Successfully ✅");
        else
            System.out.println("Invalid OTP ❌");

        sc.close();
    }
}
