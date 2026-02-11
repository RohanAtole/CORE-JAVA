import java.io.File;
import java.util.*;

public class DuplicateFileFinder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter folder path: ");
        String path = sc.nextLine();

        Map<String, List<String>> map = new HashMap<>();
        scan(new File(path), map);

        System.out.println("\n--- Duplicate Files ---");
        map.forEach((name, list) -> {
            if (list.size() > 1) {
                System.out.println(name + " -> " + list);
            }
        });

        sc.close();
    }

    static void scan(File dir, Map<String, List<String>> map) {
        File[] files = dir.listFiles();
        if (files == null) return;

        for (File f : files) {
            if (f.isFile()) {
                map.computeIfAbsent(f.getName(), k -> new ArrayList<>())
                   .add(f.getAbsolutePath());
            } else {
                scan(f, map);
            }
        }
    }
}
