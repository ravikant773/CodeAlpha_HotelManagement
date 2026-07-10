package Hotel_Management;
import java.util.ArrayList;

public class Hotel {

    private ArrayList<Room> rooms = new ArrayList<>();
    private ArrayList<Reservation> reservations = new ArrayList<>();

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public void searchRoom(String category) {
        boolean found = false;

        for (Room room : rooms) {
            if (room.getCategory().equalsIgnoreCase(category) && room.isAvailable()) {
                room.display();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No available rooms found in " + category);
        }
    }

    public Room getRoom(int roomNo) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNo) {
                return room;
            }
        }
        return null;
    }

    public Reservation bookRoom(int bookingId, Customer customer, Room room) {
        room.bookRoom();
        Reservation reservation = new Reservation(bookingId, customer, room);
        reservations.add(reservation);
        return reservation;
    }

    public boolean cancelBooking(int bookingId) {
        for (Reservation r : reservations) {
            if (r.getBookingId() == bookingId) {
                r.getRoom().cancelRoom();
                reservations.remove(r);
                return true;
            }
        }
        return false;
    }

    public void showAllBookings() {
        if (reservations.isEmpty()) {
            System.out.println("No bookings found.");
            return;
        }

        for (Reservation r : reservations) {
            r.displayBooking();
        }
    }
}