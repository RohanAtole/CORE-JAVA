package variablesdatatypes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInput {

    public static void main(String[] args) throws NumberFormatException, IOException {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int num = Integer.parseInt(br.readLine());
            System.out.println(num);
        }

        // No need for finally or br.close() (auto closed)
    }
}
