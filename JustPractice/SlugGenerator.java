import java.util.Scanner;

public class SlugGenerator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter title: ");
        String title = sc.nextLine().toLowerCase().trim();

        String slug = title.replaceAll("[^a-z0-9\\s]", "")
                           .replaceAll("\\s+", "-");

        System.out.println("Generated Slug: " + slug);

        sc.close();
    }
}
