import java.io.*;
import java.util.Scanner;

public class ChatLogger {

    static final String FILE = "chatlog.txt";

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1.Send Message  2.View Chat  3.Exit");
            int ch = sc.nextInt();
            sc.nextLine();

            if (ch == 1) sendMessage(sc);
            else if (ch == 2) viewChat();
            else break;
        }
    }

    static void sendMessage(Scanner sc) throws Exception {
        System.out.print("You: ");
        String msg = sc.nextLine();

        FileWriter fw = new FileWriter(FILE, true);
        fw.write("You: " + msg + "\n");
        fw.close();

        System.out.println("Message saved.");
    }

    static void viewChat() throws Exception {
        File file = new File(FILE);
        if (!file.exists()) {
            System.out.println("No chat history.");
            return;
        }

        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;

        System.out.println("\n--- Chat History ---");
        while ((line = br.readLine()) != null)
            System.out.println(line);

        br.close();
    }
}
