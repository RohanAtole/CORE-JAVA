import java.io.*;
import java.util.*;

public class LogFileAnalyzer {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter log file path: ");
        String path = sc.nextLine();

        File file = new File(path);
        if (!file.exists()) {
            System.out.println("File not found!");
            return;
        }

        Map<String, Integer> count = new HashMap<>();
        count.put("ERROR", 0);
        count.put("INFO", 0);
        count.put("WARNING", 0);

        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;

        while ((line = br.readLine()) != null) {
            if (line.contains("ERROR"))
                count.put("ERROR", count.get("ERROR") + 1);
            else if (line.contains("WARNING"))
                count.put("WARNING", count.get("WARNING") + 1);
            else if (line.contains("INFO"))
                count.put("INFO", count.get("INFO") + 1);
        }
        br.close();

        System.out.println("\n--- Log Summary ---");
        count.forEach((k, v) -> System.out.println(k + " : " + v));
    }
}
