import java.time.LocalDate;
import java.util.Scanner;

public class VotingEligibilityChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter birth year: ");
        int year = sc.nextInt();

        int age = LocalDate.now().getYear() - year;

        if (age >= 18)
            System.out.println("Eligible to vote ✅ (Age: " + age + ")");
        else
            System.out.println("Not eligible ❌ (Age: " + age + ")");

        sc.close();
    }
}
