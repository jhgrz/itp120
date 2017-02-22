
package jgrzesiakmod1;


public class Ex6WinningPercentage {

	public static void main(String[] args) {
		
		// define the following variables.  You decide
		// the data types (but remember my comments from our module 1 documentation).
		//  Write your line of code after
		// my comment and LEAVE my comments in for
		// documentation. Do this in all of your submissions
		
		// a variable named teamName that represents your team name
		String teamName;
		// a variable named numGames that represents the number of games played
		int numGames;
		//a variable named wins that represents the number of wins for the team 
		int wins;
		
		// Set the value of the variables.  Let's do the calculation for the 
		// Chicago Cubs in the 2016 World Series season.  They played 161
		// games and won 103 of them.  
		teamName = "Chicago Cubs";
		numGames = 161;
		wins = 103;
		
		// Now create the variable named percentWins and use it to store 
		// the calculation of the percentage of wins
		// we will need to discuss integer division (see also page 51 of Deitel)
		double percentWins = (((double)wins) * 100 / numGames);

		// Have your program print out a statement that 
		// summarizes the above information.  It should say
		// "The Chicago Cubs won 103 games in 2016.  They played 161.  That 
		// gave them a winning percentage of 64%.
		// Do not worry at this point about how the decimal is formatted
		//We will address this in the next module.
		System.out.println("The Chicago Cubs won " + wins + " games in 2016.  They played " 
		+ numGames + ".  That gave them a winning percentage of " + percentWins + ".");

		
	}
}
