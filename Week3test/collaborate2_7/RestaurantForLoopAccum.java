package collaborate2_7;

import java.text.NumberFormat;
/* Takes a meal price from the user and calculates the total with the 
 the tip and tax */
import java.util.Scanner;

public class RestaurantForLoopAccum {

	public static void main(String[] args) {

		NumberFormat nf = NumberFormat.getCurrencyInstance();
		// Initializes the tax rate to 6.75% and tip percent to 15%
		final double TAX_RATE = 6.75;
		final double TIP_PERCENT = 15;

		// Calls the scanner class
		Scanner scan = new Scanner(System.in);
		
		// create your counter and accumulator variables
		int numTickets = 0;
		double totalMoney = 0;
		
		System.out.println("How many meal tickets do you have?");
		int number = scan.nextInt();

		// get your loop variable and initialize it
		//String more = "yes";
		// top of loop

		// can only use < > != == <= >= for primitive data types
		// for Strings you must use equals
		
		// remember = is assignment  and == equals
		
		//while (more.equalsIgnoreCase("yes")) {
		for (int index = 0; index<number;index++){
			// Gets the meal price and assigns it to the mealPrice variable
			System.out.println("How much was the meal?:");
			double mealPrice = scan.nextDouble();

			// Calculates the tip,tax, and total.
			double chargedTax = mealPrice * (TAX_RATE / 100);
			double mealPlusTax = mealPrice + chargedTax;
			double chargedTip = mealPlusTax * (TIP_PERCENT / 100);
			double total = mealPrice + chargedTip + chargedTax;
			
			// add to your counter and accumulator
			numTickets++;   // numTickets = numTickets +1;
			totalMoney = totalMoney + total;

			// Prints out the results
			System.out.println("For the meal price of " + nf.format(mealPrice)
					+ " and with a " + TAX_RATE + "% tax rate and a "
					+ TIP_PERCENT + "% tip:" + "\nThe tax is "
					+ nf.format(chargedTax) + "\nThe tip is "
					+ nf.format(chargedTip) + "\nthe total comes to "
					+ nf.format(total));
			
			//scan.nextLine();
			//System.out.println ("More tickets? (yes or no)");
			//more = scan.nextLine();

		}// end of loop
		
		// print counter and accumulator here
		System.out.println("There were " + numTickets + " tickets");
		System.out.println("The total money is your pocket is " + nf.format(totalMoney));
	}

}
