import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Transaction {

    int transactionId;
    static int counter = 1000;

    String type;
    String stockName;
    int quantity;
    double amount;

    String status;

    LocalDateTime date;


    Transaction(String type, String stockName, int quantity, double amount) {

        this.transactionId = ++counter;

        this.type = type;
        this.stockName = stockName;
        this.quantity = quantity;
        this.amount = amount;

        this.status = "SUCCESS";

        this.date = LocalDateTime.now();

    }



    void displayTransaction(){

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");


        System.out.println(
            "ID: "+transactionId+
            " | Type: "+type+
            " | Stock: "+stockName+
            " | Qty: "+quantity+
            " | Amount: ₹"+amount+
            " | Status: "+status+
            " | Date: "+date.format(formatter)
        );

    }

}