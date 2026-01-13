import java.io.*;
import java.util.Scanner;

public class NotesApp {

    static final String FILE_NAME = "notes.txt";

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1.Write Note  2.Read Notes  3.Exit");
            System.out.print("Choice: ");
            int ch = sc.nextInt();
            sc.nextLine();

            if (ch == 1) writeNote(sc);
            else if (ch == 2) readNotes();
            else break;
        }
        sc.close();
    }

    static void writeNote(Scanner sc) throws IOException {
        System.out.print("Enter note: ");
        String note = sc.nextLine();

        FileWriter fw = new FileWriter(FILE_NAME, true);
        fw.write(note + "\n");
        fw.close();

        System.out.println("Note saved!");
    }

    static void readNotes() throws IOException {
        File file = new File(FILE_NAME);

        if (!file.exists()) {
            System.out.println("No notes found.");
            return;
        }

        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;

        System.out.println("\n--- Your Notes ---");
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }
}
