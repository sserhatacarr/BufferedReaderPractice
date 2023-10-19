import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        try {
            BufferedReader reader = new BufferedReader(new FileReader("numbers.txt"));
            String line = reader.readLine();
            while (line != null) {
                int number = Integer.parseInt(line);
                sum += number;
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Sum: " + sum);

    }
}
