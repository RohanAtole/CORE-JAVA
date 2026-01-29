import java.io.File;
import java.util.Scanner;

public class FileSizeCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file path: ");
        String path = sc.nextLine();

        File file = new File(path);

        if (file.exists() && file.isFile()) {
            long bytes = file.length();
            System.out.println("File Size:");
            System.out.println(bytes + " bytes");
            System.out.println((bytes / 1024) + " KB");
            System.out.println((bytes / (1024 * 1024)) + " MB");
        } else {
            System.out.println("File not found!");
        }

        sc.close();
    }
}
