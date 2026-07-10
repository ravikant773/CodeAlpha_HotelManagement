public class User {

    String name;
    double balance;

    Portfolio portfolio;


    User(String name,double balance){

        this.name=name;
        this.balance=balance;
        portfolio=new Portfolio(balance);

    }



    void showBalance(){

        System.out.println(
            "Balance: ₹"+balance
        );

    }

}