// first statement is always the package statement
package jgrzesiakmod1;

//then imports
// note: you can also do java.util.*; to let Java find anything in the java.util package
//unlike C++, it is not imported until needed so this is no slower running than doing
//each individual class like below:
import java.util.Scanner;

public class Ex8GasMileage {

	public static void main(String[] args) {

		// this program will use the five most commons data types
		// the primitives int, double, boolean, and char
		// and the reference type (it is actually a class) String
		// we will also put in a loop from chapter 4

		// usually we declare our variables first
		// if we know the initial value, we initialize the variable at the same
		// time
		int miles;
		
		double gallons, mpg;
		boolean answer = true;
		char type;
		String name;
		// You will probably see light bulbs with yellow warnings on the two lines above
		// These can be ignored.  You need to deal with every red X but these warnings
		// are Eclipse being a little too strict

		// create a Scanner object used to read from the keyboard. Look at the
		// document named
		// ScannerProblems.doc to see some problems using this class
		Scanner scan = new Scanner(System.in);

		// start the loop. We no know know how many times we will run the
		// program
		// so we will use a while look and continue while your answer is true

		while (answer == true) {

			// get the input from the keyboard using the Scanner class
			System.out.println("What is your name");
			name = scan.nextLine(); // expects you to type in a string of
									// characters

			System.out
					.println("Did you buy regular or premium gas (answer R or P)");
			String strType = scan.nextLine(); // NOTE: there is no method for
												// reading char data types in
												// the
			// Scanner class so you must read it in as a String and then
			// get the first character from it.
			type = strType.charAt(0); // expects you to type in a single
										// character
			
			double odometer; 
			System.out.println("Enter the starting odometer reading: ");
			odometer = scan.nextDouble();

			System.out.println("Enter the number of miles: ");
			miles = scan.nextInt(); // expects you to type in a whole number

			System.out.println("Enter the gallons of fuel used: ");
			gallons = scan.nextDouble(); // expects you to type in a number with
											// an optional decimal

			// now do your calculations
			mpg = miles / gallons;
			odometer = odometer + miles;
			// now output your answer
			System.out.println("Miles per gallon: " + mpg);
			
			// Outputting the new odometer reading.
			System.out.println("Your new odometer reading is: " + odometer);

			// see if the user wants to calculate again
			System.out.println("Another calculation? (true or false)");
			answer = scan.nextBoolean(); // expects ONLY either the word true or
											// the word false
			// need the next line since we will be reading a String when we loop
			// to the top.
			scan.nextLine();

		} // end of the while loop

		System.out.println("Thanks for using my mileage calculator program");

	}// end of the main method

}

	
