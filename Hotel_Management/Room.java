package Hotel_Management;

public class Room {
    private int roomNumber;
    private String category;
    private double price;
    private boolean available;

    public Room(int roomNumber, String category, double price, boolean available) {
        this.roomNumber = roomNumber;
        this.category = category;
        this.price = price;
        this.available = available;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return available;
    }

    public void bookRoom() {
        available = false;
    }

    public void cancelRoom() {
        available = true;
    }

    public void display() {
        System.out.println(roomNumber + " | " + category + " | ₹" + price + " | Available: " + available);
    }
}