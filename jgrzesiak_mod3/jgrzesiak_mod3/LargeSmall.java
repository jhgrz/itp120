package jgrzesiak_mod3;

import java.util.Scanner;

public class LargeSmall {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = 0;
		String more = "yes";
		int numberCounter = 0;
		int numberHigh = -1;
		int numberLow = 0;

		while (more.equalsIgnoreCase("yes")) {
			System.out.println("Please enter an integer number: (1 to 100) ");
			number = scan.nextInt();

			scan.nextLine();
			System.out.println("More Numbers? (yes or no)");
			more = scan.nextLine();

			// store and check high number
			if (number > numberHigh) {
				numberHigh = number;
			}
			// store low number as number because I dont want to set a higher
			// initial value in the field
			if (numberLow == 0) {
				numberLow = number;
			}
			// check low number
			else if (numberLow > number) {
				numberLow = number;
			}

			// count loops
			++numberCounter;

		} // end while

		// Print Summary
		System.out.println("The Max is " + numberHigh + " and the Min is " + numberLow 
				+ ". The number of values was " + numberCounter + ". ");

	}

}
