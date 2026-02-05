import java.io.*;
import java.util.*;

public class CsvTableViewer {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter CSV file path: ");
        String path = sc.nextLine();

        BufferedReader br = new BufferedReader(new FileReader(path));
        String line;

        System.out.println("\n--- CSV TABLE ---");

        while ((line = br.readLine()) != null) {
            String[] cols = line.split(",");
            for (String col : cols) {
                System.out.printf("%-15s", col);
            }
            System.out.println();
        }

        br.close();
        sc.close();
    }
}
