package basicConstructs;

public class DiceGame {

	public static void main(String[] args) {
		
		int rolls = 0;
		int compRoll = 0;
		int humaRoll = 0;
		int totalComp = 0;
		int totalHuma = 0;
		int totalTie = 0;
		
		for (rolls = 0; rolls < 100; rolls++){
			//generate rolls
			compRoll = (int) (Math.random()*6) +1;
			humaRoll = (int) (Math.random()*6) +1;

			//print roll result
			System.out.println("Computer's number: " + compRoll);
			System.out.println("Player's number: " + humaRoll);
			
			//decide who won each roll and increment counter
			if (compRoll > humaRoll){
				System.out.println("Computer Wins!\n");
				++totalComp;
			}
			else if (humaRoll > compRoll){
				System.out.println("Player Wins!\n");
				++totalHuma;
			}
			else{
				System.out.println("It's a tie!\n");
				++totalTie;
			}
			
		}//end loop
		
		//decide who the grand winner was after loop
		if (totalComp > totalHuma){
			System.out.println("The computer was the grand winner with " + totalComp + " wins.");
			System.out.println("The player had " + totalHuma + " wins.");
		}
		else{
			System.out.println("The player was the grand winner with " + totalHuma + " wins.");
			System.out.println("The computer had " + totalComp + " wins.");
		}//end if
		
		//always print
		System.out.println("There were " + totalTie + " ties.");
	}

}
