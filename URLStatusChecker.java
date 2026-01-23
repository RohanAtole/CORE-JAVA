import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class URLStatusChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter website URL (https://...): ");
        String site = sc.nextLine();

        try {
            URL url = new URL(site);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.setConnectTimeout(3000);

            int code = con.getResponseCode();

            if (code == 200)
                System.out.println("Website is UP ✅ (Status 200)");
            else
                System.out.println("Website responded with code: " + code);

        } catch (Exception e) {
            System.out.println("Website is DOWN ❌ or invalid URL.");
        }

        sc.close();
    }
}
