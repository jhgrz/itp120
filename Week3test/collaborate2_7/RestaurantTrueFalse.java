package collaborate2_7;

import java.text.NumberFormat;
/* Takes a meal price from the user and calculates the total with the 
 the tip and tax */
import java.util.Scanner;

public class RestaurantTrueFalse {

	public static void main(String[] args) {

		NumberFormat nf = NumberFormat.getCurrencyInstance();
		// Initializes the tax rate to 6.75% and tip percent to 15%
		final double TAX_RATE = 6.75;
		final double TIP_PERCENT = 15;

		// Calls the scanner class
		Scanner scan = new Scanner(System.in);

		// get your loop variable and initialize it
		boolean more = true;
		// top of loop

		while (more == true) {

			// Gets the meal price and assigns it to the mealPrice variable
			System.out.println("How much was the meal?:");
			double mealPrice = scan.nextDouble();

			// Calculates the tip,tax, and total.
			double chargedTax = mealPrice * (TAX_RATE / 100);
			double mealPlusTax = mealPrice + chargedTax;
			double chargedTip = mealPlusTax * (TIP_PERCENT / 100);
			double total = mealPrice + chargedTip + chargedTax;

			// Prints out the results
			System.out.println("For the meal price of " + nf.format(mealPrice)
					+ " and with a " + TAX_RATE + "% tax rate and a "
					+ TIP_PERCENT + "% tip:" + "\nThe tax is "
					+ nf.format(chargedTax) + "\nThe tip is "
					+ nf.format(chargedTip) + "\nthe total comes to "
					+ nf.format(total));
			
			System.out.println ("More tickets? (true or false)");
			more = scan.nextBoolean();

		}// end of loop
	}

}
