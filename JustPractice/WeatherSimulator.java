import java.util.*;

public class WeatherSimulator {

    static Map<String, String[]> data = new HashMap<>();

    static {
        data.put("sunny", new String[]{"Clear sky", "Hot temperature", "No rain"});
        data.put("rainy", new String[]{"Heavy clouds", "Cool breeze", "High humidity"});
        data.put("cold", new String[]{"Foggy", "Low temperature", "Dry weather"});
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter city name: ");
        String city = sc.nextLine();

        String[] types = {"sunny", "rainy", "cold"};
        String weather = types[new Random().nextInt(types.length)];

        System.out.println("\nWeather Report for " + city);
        for (String s : data.get(weather)) {
            System.out.println("- " + s);
        }

        sc.close();
    }
}
