import java.util.Scanner;

public class EmailSlicer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your email: ");
        String email = sc.nextLine();

        if (!email.contains("@")) {
            System.out.println("Invalid email format!");
            return;
        }

        String username = email.substring(0, email.indexOf("@"));
        String domain = email.substring(email.indexOf("@") + 1);

        System.out.println("Username: " + username);
        System.out.println("Domain  : " + domain);

        sc.close();
    }
}
