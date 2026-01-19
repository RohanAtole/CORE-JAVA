import java.util.Scanner;

public class SimpleQRGenerator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        int hash = text.hashCode();
        System.out.println("\nGenerated Pattern:\n");

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if ((hash >> (i + j)) % 2 == 0)
                    System.out.print("##");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        sc.close();
    }
}
