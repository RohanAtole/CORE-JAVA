import java.io.File;
import java.util.Scanner;

public class FolderFileCounter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter folder path: ");
        String path = sc.nextLine();

        File folder = new File(path);

        if (!folder.exists() || !folder.isDirectory()) {
            System.out.println("Invalid folder!");
            return;
        }

        int count = countFiles(folder);
        System.out.println("Total files in folder: " + count);

        sc.close();
    }

    static int countFiles(File dir) {
        int total = 0;
        File[] files = dir.listFiles();

        if (files != null) {
            for (File f : files) {
                if (f.isFile())
                    total++;
                else
                    total += countFiles(f);
            }
        }
        return total;
    }
}
