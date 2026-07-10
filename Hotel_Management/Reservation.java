package Hotel_Management;

public class Reservation {
    private int bookingId;
    private Customer customer;
    private Room room;

    public Reservation(int bookingId, Customer customer, Room room) {
        this.bookingId = bookingId;
        this.customer = customer;
        this.room = room;
    }

    public int getBookingId() {
        return bookingId;
    }

    public Room getRoom() {
        return room;
    }

    public Customer getCustomer() {
        return customer;
    }

    public String getDetails() {
        return "Booking ID: " + bookingId +
                ", Customer: " + customer.getName() +
                ", Room: " + room.getRoomNumber() +
                ", Category: " + room.getCategory() +
                ", Price: ₹" + room.getPrice();
    }

    public void displayBooking() {
        System.out.println(getDetails());
    }
}