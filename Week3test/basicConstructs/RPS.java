package basicConstructs;

import java.util.Scanner;

public class RPS {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String humaChoice = "";
		String compChoiceS = "";
		int compChoice = 0;
		int gameCounter;
		int compCounter = 0;
		int humaCounter = 0;
		String grand;

		for (gameCounter = 1; gameCounter < 6; gameCounter++) {

			System.out.println("Round " + gameCounter + "\nPlease enter rock, paper or scissors using only lower case letters:");
			
			humaChoice = scan.nextLine();
			compChoice = (int) (Math.random() * 3) + 1;
			
			if (compChoice < 2)
				compChoiceS = "rock";
			else if (compChoice < 3)
				compChoiceS = "paper";
			else
				compChoiceS = "scissors";

			System.out.print("The computer's choice was " + compChoiceS);
			System.out.println("\nThe user's choice was " + humaChoice);

			// decision who won when user selects rock
			if (humaChoice.equals("rock")) {
				if (compChoiceS.equals("rock"))
					System.out.println("Its a tie. No one wins!!\n");
				else if (compChoiceS.equals("paper")) {
					System.out.println("Paper covers rock.\nThe computer wins!\n");
					compCounter++;
				} else {
					System.out.println("Rock crushes scissors.\nThe user wins!\n");
					humaCounter++;
				}
			} // end who won rock

			// decision who won when user selects paper
			else if (humaChoice.equals("paper")) {
				if (compChoiceS.equalsIgnoreCase("rock")) {
					System.out.println("Paper covers rock.\nThe user wins!\n");
					humaCounter++;
				} else if (compChoiceS.equals("paper"))
					System.out.println("Its a tie. No one wins!!\n");
				else {
					System.out.println("Scissors cut paper.\nThe computer wins!\n");
					compCounter++;
				}
			} // end who won paper

			// decision who won when user selects scissors
			else if (humaChoice.equals("scissors")) {
				if (compChoiceS.equals("rock")) {
					System.out.println("Rock crushes scissors.\nThe computer wins!\n");
					compCounter++;
				} else if (compChoiceS.equals("paper")) {
					System.out.println("Scissors cut paper.\nThe user wins!\n");
					humaCounter++;
				} else
					System.out.println("Its a tie. No one wins!!\n");
			} // end who won scissors

		} // end for loop

		// calculate grand winner
		if (humaCounter > compCounter)
			grand = "the user";
		else if (humaCounter == compCounter)
			grand = "noone, it was a tie";
		else
			grand = "the computer";

		System.out.println("The user won " + humaCounter + " times and the computer won " + compCounter
				+ " times\nThe grand winner is " + grand);
	}

}
