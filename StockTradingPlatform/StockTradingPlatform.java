import java.util.Scanner;


public class StockTradingPlatform {


public static void main(String args[]){


Scanner sc=new Scanner(System.in);


// Market Stocks

Stock tata =
new Stock("TATA","Tata Motors",800);

Stock infosys =
new Stock("INFY","Infosys",1500);

Stock reliance =
new Stock("REL","Reliance",2500);



User user =
new User("Rahul",50000);



int choice;


do{


System.out.println("\n===== STOCK TRADING PLATFORM =====");

System.out.println("1. Show Market Data");
System.out.println("2. Buy Stock");
System.out.println("3. Sell Stock");
System.out.println("4. Show Portfolio");
System.out.println("5. Transaction History");
System.out.println("6. Exit");


System.out.print("Enter Choice: ");

choice=sc.nextInt();



switch(choice){


case 1:

System.out.println("\nMarket Data:");

tata.displayStock();
infosys.displayStock();
reliance.displayStock();

break;



case 2:

System.out.println("Choose Stock:");
System.out.println("1 Tata");
System.out.println("2 Infosys");
System.out.println("3 Reliance");

int b=sc.nextInt();


System.out.print("Quantity:");
int qty=sc.nextInt();


if(b==1)
user.portfolio.buyStock(tata,qty);

else if(b==2)
user.portfolio.buyStock(infosys,qty);

else if(b==3)
user.portfolio.buyStock(reliance,qty);


break;



case 3:


System.out.println("Sell Stock:");

System.out.println("1 Tata");
System.out.println("2 Infosys");
System.out.println("3 Reliance");


int s=sc.nextInt();


System.out.print("Quantity:");
int sell=sc.nextInt();



if(s==1)
user.portfolio.sellStock(tata,sell);

else if(s==2)
user.portfolio.sellStock(infosys,sell);

else if(s==3)
user.portfolio.sellStock(reliance,sell);


break;



case 4:

user.portfolio.showPortfolio();

break;



case 5:

user.portfolio.showTransactions();

break;



case 6:

System.out.println("Thank You!");

break;


default:

System.out.println("Invalid Choice");


}



}while(choice!=6);



sc.close();

}

}