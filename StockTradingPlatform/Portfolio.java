// package stocktradingplatform;

import java.util.*;



public class Portfolio {


    HashMap<String,Integer> stocks=new HashMap<>();

    ArrayList<Transaction> transactions=new ArrayList<>();

    double balance;



    Portfolio(double balance){

        this.balance=balance;

    }



    void buyStock(Stock stock,int quantity){


        double cost=stock.price*quantity;


        if(cost<=balance){


            balance-=cost;


            stocks.put(
                stock.symbol,
                stocks.getOrDefault(stock.symbol,0)+quantity
            );


            transactions.add(
                new Transaction(
                    "BUY",
                    stock.name,
                    quantity,
                    cost
                )
            );
            FileStorage.saveData(
            "BUY : "+stock.name+
            " Quantity : "+quantity
            );




            System.out.println("Stock Bought Successfully");

        }

        else{

            System.out.println("Insufficient Balance");

        }

    }




    void sellStock(Stock stock,int quantity){


        int available=
        stocks.getOrDefault(stock.symbol,0);



        if(available>=quantity){


            stocks.put(
                stock.symbol,
                available-quantity
            );


            double amount=stock.price*quantity;


            balance+=amount;



            transactions.add(
                new Transaction(
                    "SELL",
                    stock.name,
                    quantity,
                    amount
                )
            );


            System.out.println("Stock Sold Successfully");

        }

        else{

            System.out.println("Not enough stocks");

        }

    }




    void showPortfolio(){


        System.out.println("\n---- PORTFOLIO ----");


        for(String s:stocks.keySet()){

            System.out.println(
                s+" : "+
                stocks.get(s)+" shares"
            );

        }


        System.out.println(
            "Balance ₹"+balance
        );

    }




   void showTransactions(){

    System.out.println("\n------ TRANSACTION HISTORY ------");


    if(transactions.isEmpty()){

        System.out.println("No Transactions");
        return;

    }


    for(Transaction t : transactions){

        t.displayTransaction();

    }

}
  
}