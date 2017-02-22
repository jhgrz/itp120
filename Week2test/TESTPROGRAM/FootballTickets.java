package TESTPROGRAM;
import java.util.Scanner;


public class FootballTickets {
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int numTickets;
		double costEach;
		String homeTeam;
		String visitingTeam;
		final double TICKET_FEE = .015;
		double cost;
		
		
		System.out.println("How many tickets are required: ");
		numTickets = scan.nextInt(); 
		
		System.out.println("What is the ticket price: ");
		costEach = scan.nextDouble();
		
		scan.nextLine();
		System.out.println("Who is the Home Team: ");
		homeTeam = scan.nextLine();
		
		System.out.println("Who is the Visiting Team: ");
		visitingTeam = scan.nextLine();
		
		
		cost = (numTickets * costEach);
		double costwithfees = (cost + cost * TICKET_FEE);
		
		
		System.out.println("We purchased " + numTickets + " tickets for the " + 
		visitingTeam + " at the " + homeTeam + " for $" + costEach + " each for a total of "
		+ cost + ".  The total with fees was $" + costwithfees);
		


	}

}
