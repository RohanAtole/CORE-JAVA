import java.io.File;
import java.util.Scanner;

public class FileRenameTool {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter existing file path: ");
        String oldPath = sc.nextLine();

        System.out.print("Enter new file name: ");
        String newName = sc.nextLine();

        File oldFile = new File(oldPath);

        if (!oldFile.exists()) {
            System.out.println("File does not exist!");
            return;
        }

        File newFile = new File(oldFile.getParent(), newName);

        if (oldFile.renameTo(newFile))
            System.out.println("File renamed successfully ✅");
        else
            System.out.println("Rename failed ❌");

        sc.close();
    }
}
