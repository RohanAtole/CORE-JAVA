import java.util.*;

class Movie {
    String name, genre;

    Movie(String name, String genre) {
        this.name = name;
        this.genre = genre;
    }
}

public class MovieRecommender {

    static List<Movie> movies = List.of(
            new Movie("Inception", "Sci-Fi"),
            new Movie("Avengers", "Action"),
            new Movie("Titanic", "Romance"),
            new Movie("Conjuring", "Horror"),
            new Movie("Interstellar", "Sci-Fi")
    );

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter preferred genre: ");
        String pref = sc.nextLine();

        System.out.println("\nRecommended Movies:");

        boolean found = false;
        for (Movie m : movies) {
            if (m.genre.equalsIgnoreCase(pref)) {
                System.out.println("- " + m.name);
                found = true;
            }
        }

        if (!found)
            System.out.println("No movies found for this genre.");

        sc.close();
    }
}
