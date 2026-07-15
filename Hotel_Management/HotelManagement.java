package Hotel_Management;

import java.util.Scanner;

public class HotelManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Hotel hotel = new Hotel();

        // Add Rooms
        hotel.addRoom(new Room(101, "Standard", 2000, true));
        hotel.addRoom(new Room(102, "Deluxe", 3500, true));
        hotel.addRoom(new Room(103, "Suite", 6000, true));

        int choice;

        do {
            System.out.println("\n========== HOTEL MANAGEMENT SYSTEM ==========");
            System.out.println("1. Search Room");
            System.out.println("2. Book Room");
            System.out.println("3. View All Bookings");
            System.out.println("4. Cancel Booking");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    sc.nextLine();
                    System.out.print("Enter Room Type (Standard/Deluxe/Suite): ");
                    String type = sc.nextLine();
                    hotel.searchRoom(type);
                    break;

                case 2:

                    System.out.print("Enter Customer ID: ");
                    int customerId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Customer Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Phone Number: ");
                    String phone = sc.nextLine();

                    System.out.print("Enter Room Number: ");
                    int roomNo = sc.nextInt();

                    Room room = hotel.getRoom(roomNo);

                    if (room != null && room.isAvailable()) {

                        Customer customer = new Customer(customerId, name, phone);

                        Payment payment = new Payment();

                        if (payment.makePayment(room.getPrice())) {

                            int bookingId = 1000 + customerId;

                            Reservation reservation =
                                    hotel.bookRoom(bookingId, customer, room);

                            System.out.println("\n===== BOOKING DETAILS =====");
                            reservation.displayBooking();

                            FileStorage.saveBooking(reservation.getDetails());

                            System.out.println("\nRoom Booked Successfully!");
                        }

                    } else {
                        System.out.println("Room is not available.");
                    }

                    break;

                case 3:
                    System.out.println("\n===== ALL BOOKINGS =====");
                    hotel.showAllBookings();
                    break;

                case 4:

                    System.out.print("Enter Booking ID to Cancel: ");
                    int bookingId = sc.nextInt();

                    if (hotel.cancelBooking(bookingId)) {
                        System.out.println("Booking Cancelled Successfully.");
                    } else {
                        System.out.println("Booking Not Found.");
                    }

                    break;

                case 5:
                    System.out.println("Thank You for Using Hotel Management System!");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 5);

        sc.close();
    }
}