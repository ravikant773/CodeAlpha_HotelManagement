public class StockMarket {

    void updatePrice(Stock stock, double price) {

        stock.price = price;

        System.out.println("New Price : ₹" + price);

    }

}