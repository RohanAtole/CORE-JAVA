import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class FileHandlingExample {

    public static void main(String[] args) {

        try {
            // Writing to file
            FileWriter writer = new FileWriter("userdata.txt");
            writer.write("Username: Rohan\n");
            writer.write("Role: Java Developer\n");
            writer.close();

            // Reading from file
            FileReader reader = new FileReader("userdata.txt");
            int ch;
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
            reader.close();

        } catch (IOException e) {
            System.out.println("File Error: " + e.getMessage());
        }
    }
}
