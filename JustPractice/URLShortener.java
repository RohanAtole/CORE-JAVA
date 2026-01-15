import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class URLShortener {

    private static final String BASE62 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static final Map<String, String> db = new HashMap<>();

    public static void main(String[] args) {
        String longUrl = "https://example.com/my/very/long/url";
        String shortUrl = shorten(longUrl);

        System.out.println("Short URL: " + shortUrl);
        System.out.println("Original URL: " + expand(shortUrl));
    }

    static String shorten(String longUrl) {
        String key = generateKey();
        db.put(key, longUrl);
        return "https://short.ly/" + key;
    }

    static String expand(String shortUrl) {
        String key = shortUrl.substring(shortUrl.lastIndexOf("/") + 1);
        return db.get(key);
    }

    static String generateKey() {
        Random r = new Random();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 6; i++) {
            sb.append(BASE62.charAt(r.nextInt(BASE62.length())));
        }
        return sb.toString();
    }
}
