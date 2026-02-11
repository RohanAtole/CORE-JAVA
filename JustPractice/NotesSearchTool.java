import java.io.*;
import java.util.Scanner;

public class NotesSearchTool {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter notes file path: ");
        String path = sc.nextLine();

        System.out.print("Enter keyword to search: ");
        String key = sc.nextLine().toLowerCase();

        BufferedReader br = new BufferedReader(new FileReader(path));
        String line;
        int lineNo = 1;

        while ((line = br.readLine()) != null) {
            if (line.toLowerCase().contains(key)) {
                System.out.println("Line " + lineNo + ": " + line);
            }
            lineNo++;
        }

        br.close();
        sc.close();
    }
}
