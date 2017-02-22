package basicConstructs;

import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int guess = 0;
		int number = 0;
		int guessCounter = 0;
		String more = "yes";

		while (more.equalsIgnoreCase("yes")) {
			guessCounter = 0;
			System.out.println("Guess the number (1 - 20): ");
			number = (int) (Math.random() * 20) + 1;
			
			//Check if number was high/low
			
			while (number != guess){
				
				guess = scan.nextInt();
				++guessCounter;
				
				if (guess > number){
					System.out.println("Your Guess was high. Guess again.");
				}
				else if (guess < number){
					System.out.println("Your Guess was low. Guess again.");
				}

			}//Close enter guesses while
			
			scan.nextLine();
			System.out.println("You guessed right!  It took you " + guessCounter + " guesses.");
			System.out.println("Do you want to play again? (yes or no):");
			more = scan.nextLine();
				
			
		} // Close yes/no while
		
		System.out.println("Thanks for Playing!");
	}

}
