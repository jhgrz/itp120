/*
 * Created on 01/18/17
 * John Grzesiak
 */
package jgrzesiakmod1;
import java.util.Scanner;


public class Restaurant {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		final double TAX = .0675;
		final double TIP = .15;
		double bill;
		double billTax;
		double billTip;
		double billTotal;
		
		System.out.println("What was the charge for the meal (without tax): ");
		bill = scan.nextDouble();
		
		billTax = bill * TAX;
		billTip = bill * TIP;
		billTotal = bill + billTax + billTip;
		
		System.out.println("The amount paid for the meal without tax was $" + bill + 
		".  The calculated tax was $" + billTax + ".  The calculated tip was $" + billTip + 
		".  \nFinally, the total bill was $" + billTotal);
	

	}

}
