import java.util.*;

public class VotingSystem {

    static HashMap<String, Integer> votes = new HashMap<>();
    static HashSet<String> voters = new HashSet<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        votes.put("Alice", 0);
        votes.put("Bob", 0);
        votes.put("Charlie", 0);

        while (true) {
            System.out.print("\nEnter Voter ID (or exit): ");
            String voterId = sc.nextLine();

            if (voterId.equalsIgnoreCase("exit"))
                break;

            if (voters.contains(voterId)) {
                System.out.println("You have already voted!");
                continue;
            }

            System.out.println("Candidates: " + votes.keySet());
            System.out.print("Vote for: ");
            String candidate = sc.nextLine();

            if (votes.containsKey(candidate)) {
                votes.put(candidate, votes.get(candidate) + 1);
                voters.add(voterId);
                System.out.println("Vote recorded.");
            } else {
                System.out.println("Invalid candidate.");
            }
        }

        System.out.println("\n--- Final Results ---");
        votes.forEach((k, v) -> System.out.println(k + " : " + v + " votes"));
    }
}
