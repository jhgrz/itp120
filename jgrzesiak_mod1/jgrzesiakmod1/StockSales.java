/*
 * Created on 01/18/17
 * John Grzesiak
 */
package jgrzesiakmod1;
import java.util.Scanner;

public class StockSales {

	public static void main(String[] args) {
		
		//Variables
		Scanner scan = new Scanner(System.in);
		String stock;
		double stockPurch;
		int shares;
		final double COMMISSION;
		double stockSell;
		
		//User Input
		System.out.println("What is the name of the stock: ");
		stock = scan.nextLine();
		
		System.out.println("What is the purchase cost per share: ");
		stockPurch = scan.nextDouble();
		
		System.out.println("What is the commission rate in percentage (5% as 5): ");
		COMMISSION = scan.nextDouble();
		
		System.out.println("How many shares were purchased: ");
		shares = scan.nextInt();
		
		System.out.println("What was the sales cost per share: ");
		stockSell = scan.nextDouble();
		
		//Purchase 
		double stockPurchAmt = stockPurch * shares;
		double commissionPurch = stockPurchAmt * (COMMISSION / 100);
		double totalPurch = stockPurchAmt + commissionPurch;
		//Sales 
		double stockSellAmt = stockSell * shares;
		double commissionSell = stockSellAmt * (COMMISSION / 100);
		double totalSell = stockSellAmt - commissionSell;
		//totals for net
		double netReturn = totalSell - totalPurch;
		
		//Output of calculations
		System.out.println("Amount for the stock alone (without the commission) :" + stockPurchAmt);
		System.out.println("Amount of the commission in dollars for the purchase: " + commissionPurch);
		System.out.println("Total amount paid (for the stock plus commission) : " + totalPurch);
		System.out.println("Total value of stock when it was sold: " + stockSellAmt);
		System.out.println("Amount of the commission in dollars for the sales: " + commissionSell);
		System.out.println("The net amount of profit or loss for the transactions: " + netReturn);
	}
	

}
