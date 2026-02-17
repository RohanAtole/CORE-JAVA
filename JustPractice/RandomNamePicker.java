import java.util.*;

public class RandomNamePicker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> names = new ArrayList<>();

        System.out.print("How many names? ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names.add(sc.nextLine());
        }

        Random rand = new Random();
        String winner = names.get(rand.nextInt(names.size()));

        System.out.println("\n🎉 Selected Name: " + winner);

        sc.close();
    }
}
