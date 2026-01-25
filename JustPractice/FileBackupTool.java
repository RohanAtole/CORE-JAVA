import java.io.*;
import java.util.Scanner;

public class FileBackupTool {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter source file path: ");
        String sourcePath = sc.nextLine();

        System.out.print("Enter backup file path: ");
        String backupPath = sc.nextLine();

        FileInputStream fis = new FileInputStream(sourcePath);
        FileOutputStream fos = new FileOutputStream(backupPath);

        byte[] buffer = new byte[1024];
        int bytesRead;

        while ((bytesRead = fis.read(buffer)) != -1) {
            fos.write(buffer, 0, bytesRead);
        }

        fis.close();
        fos.close();

        System.out.println("Backup created successfully ✅");
        sc.close();
    }
}
