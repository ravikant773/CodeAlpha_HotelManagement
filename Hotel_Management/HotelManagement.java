package Hotel_Management;

public class HotelManagement {

    public static void main(String[] args) {

        Hotel hotel = new Hotel();

        // Add Rooms
        hotel.addRoom(new Room(101, "Standard", 2000, true));
        hotel.addRoom(new Room(102, "Deluxe", 3500, true));
        hotel.addRoom(new Room(103, "Suite", 6000, true));

        System.out.println("=== SEARCH DELUXE ROOMS ===");
        hotel.searchRoom("Standard");

        Customer customer = new Customer(1, "Rahul", "9876543210");

        Room room = hotel.getRoom(101);

        if (room != null && room.isAvailable()) {

            Payment payment = new Payment();

            if (payment.makePayment(room.getPrice())) {

                Reservation reservation = hotel.bookRoom(1001, customer, room);

                System.out.println("\n=== BOOKING DETAILS ===");
                reservation.displayBooking();

                // Save to file
                FileStorage.saveBooking(reservation.getDetails());

                System.out.println("\nRoom Booked Successfully!");
            }
        }

        System.out.println("\n=== ALL BOOKINGS ===");
        hotel.showAllBookings();

        // Example Cancel
        System.out.println("\n=== CANCEL BOOKING ===");
        boolean cancelled = hotel.cancelBooking(1001);

        if (cancelled) {
            System.out.println("Booking cancelled successfully.");
        } else {
            System.out.println("Booking not found.");
        }

        System.out.println("\n=== UPDATED BOOKINGS ===");
        hotel.showAllBookings();
    }
}