import java.io.*;
import java.util.Scanner;

public class FileSearchEngine {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file path: ");
        String path = sc.nextLine();

        System.out.print("Enter word to search: ");
        String word = sc.nextLine();

        File file = new File(path);
        if (!file.exists()) {
            System.out.println("File not found!");
            return;
        }

        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        int lineNo = 1;
        boolean found = false;

        while ((line = br.readLine()) != null) {
            if (line.toLowerCase().contains(word.toLowerCase())) {
                System.out.println("Found at line " + lineNo + ": " + line);
                found = true;
            }
            lineNo++;
        }

        br.close();

        if (!found)
            System.out.println("Word not found.");
    }
}
