import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;

public class URLAuditTool {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> urls = new ArrayList<>();

        System.out.println("Enter URLs (type 'done' to finish):");
        while (true) {
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("done")) break;
            urls.add(input);
        }

        System.out.println("\n--- URL Status Report ---");
        for (String site : urls) {
            checkURL(site);
        }
        sc.close();
    }

    static void checkURL(String site) {
        try {
            URL url = new URL(site);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setConnectTimeout(3000);
            int code = con.getResponseCode();
            System.out.println(site + " -> " + code);
        } catch (Exception e) {
            System.out.println(site + " -> DOWN/INVALID");
        }
    }
}
