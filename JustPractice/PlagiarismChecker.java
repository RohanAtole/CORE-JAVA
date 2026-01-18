import java.util.*;

public class PlagiarismChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first text:");
        String t1 = sc.nextLine().toLowerCase();

        System.out.println("Enter second text:");
        String t2 = sc.nextLine().toLowerCase();

        Set<String> s1 = new HashSet<>(Arrays.asList(t1.split("\\W+")));
        Set<String> s2 = new HashSet<>(Arrays.asList(t2.split("\\W+")));

        Set<String> common = new HashSet<>(s1);
        common.retainAll(s2);

        double similarity = (2.0 * common.size()) / (s1.size() + s2.size()) * 100;

        System.out.println("\nCommon Words: " + common);
        System.out.printf("Similarity: %.2f%%\n", similarity);
    }
}
