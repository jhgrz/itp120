package quoteProblemStart;

import java.util.Scanner;

/* Demonstrate the class in a program named QuoteDriver that performs the following:

 a)	The user is asked to enter a string.
 b)	The program displays a menu giving the user a choice of the methods above. 
 The user should also have a choice of either entering another String or of exiting.
 c)	The program performs the operation selected by the user and repeats 
 until the user selects to exit the program.


 */

public class QuoteDriver {

	public static void main(String[] args) {
		
		// ask the user for a quote.  Store it in a String named quote.  
		// Create an instance of the Quote class calling the full constructor.  Name the instance myQuote.

		int choice = 0;
		while (choice != 999) {
			choice = menu();
			if (choice ==999) {
				System.out.println("Thanks for playing my game!");
				System.exit(0);
			}
			else if (choice ==8){
				System.out.println("Give me a new quote to analyze");
				// ask for a new quote. Store it in a String named quote.  
				// use the setter to update the value of the field in the myQuote instance
			}
			else if (choice==1) {
				System.out.println("The number of characters in the quote is "+ myQuote.numChars() );
			}
			else if (choice==2) {
				System.out.println("The quote in all upper case is "+ myQuote.upper() );
			}
			else if (choice==3) {
				System.out.println("The quote in all lower case is "+ myQuote.lower() );
			}
			else if (choice==4) {
				System.out.println("The first character of the quote is "+ myQuote.firstChar() );
			}
			else if (choice==5) {
				System.out.println("The number of vowels in the quote is "+ myQuote.numVowels() );
			}
			else if (choice==6) {
				System.out.println("The number of consanants in the quote is "+ myQuote.numCons() );
			}
			else if (choice==7) {
				System.out.println("What character are you looking for?");
				String stWhich = scan.nextLine();
				char which = stWhich.charAt(0);
				System.out.println("The number of times the character '" + which + "' occurs in the quote is "+ myQuote.numTimes(which) );
			}

		}

	}

	public static int menu() {
		Scanner scan = new Scanner(System.in);
		System.out.println("\n Which of the following would you like:");
		System.out.println("1.  The number of characters in the quote");
		System.out.println("2.  The quote in all uppercase letters");
		System.out.println("3.  The quote in all lowercase letters");
		System.out.println("4.  The first character in the quote");
		System.out.println("5.  The number of vowels in the string");
		System.out.println("6.  The number of consonants in the string");
		System.out
				.println("7.  To count the number of occurrences of a specific character in the string");
		System.out.println("8.   Enter an new string");
		System.out.println("999.  Quit the program");

		System.out.println("CHOICE:");
		int choice = scan.nextInt();
		return choice;

	}

}
