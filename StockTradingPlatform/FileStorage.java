import java.io.FileWriter;
import java.io.IOException;

public class FileStorage {

    public static void saveData(String data) {

        try {
            FileWriter fw = new FileWriter("portfolio.txt", true);
            fw.write(data + "\n");
            fw.close();

            System.out.println("Portfolio Saved Successfully.");

        } catch (IOException e) {

            System.out.println("Error: " + e.getMessage());

        }

    }
}