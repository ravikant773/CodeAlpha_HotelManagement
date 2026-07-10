package Hotel_Management;
import java.io.FileWriter;
import java.io.IOException;

public class FileStorage {

    public static void saveBooking(String data) {
        try {
            FileWriter fw = new FileWriter("bookings.txt", true);
            fw.write(data + "\n");
            fw.close();
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}