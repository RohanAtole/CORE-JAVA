import java.io.*;
import java.util.*;

public class LogGeneratorAnalyzer {

    static final String FILE = "app.log";

    public static void main(String[] args) throws Exception {

        generateLogs();
        analyzeLogs();
    }

    static void generateLogs() throws Exception {
        FileWriter fw = new FileWriter(FILE);
        String[] levels = {"INFO", "WARNING", "ERROR"};
        Random r = new Random();

        for (int i = 0; i < 50; i++) {
            fw.write(levels[r.nextInt(3)] + " : Sample log message\n");
        }
        fw.close();
    }

    static void analyzeLogs() throws Exception {
        Map<String, Integer> map = new HashMap<>();
        map.put("INFO", 0);
        map.put("WARNING", 0);
        map.put("ERROR", 0);

        BufferedReader br = new BufferedReader(new FileReader(FILE));
        String line;

        while ((line = br.readLine()) != null) {
            for (String key : map.keySet()) {
                if (line.startsWith(key))
                    map.put(key, map.get(key) + 1);
            }
        }
        br.close();

        System.out.println("--- Log Summary ---");
        map.forEach((k, v) -> System.out.println(k + " = " + v));
    }
}
