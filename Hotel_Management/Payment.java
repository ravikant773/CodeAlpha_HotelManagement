package Hotel_Management;
public class Payment {

    public boolean makePayment(double amount) {
        System.out.println("Processing payment...");
        System.out.println("Payment of ₹" + amount + " successful.");
        return true;
    }
}