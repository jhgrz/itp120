package jgrzesiak_mod3;
import java.util.Scanner;

public class Ex5ForsNested {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How many sets of numbers do you have?");
		int numSets = scan.nextInt();
		
		// use a for loop when you know how many items you have going into the loop
		for (int i=0;i<numSets;i++)
		{
			int total=0;		// this will be an accumulator and accumulate the total
			int numItems=0;		// this is a counter - will count the number of something
			
			System.out.println("How many numbers in set number " + (i+1));
			int number=scan.nextInt();
			
			for (int j=0;j<number;j++)
			{
				System.out.println("Give me a number");
				int num = scan.nextInt();
				
				total = total + num;		// accumulate the value
				numItems++;					// add one to the number of items
				
			}
			System.out.println("You had " + numItems + " numbers and the total is " + total);
			
		}
		System.out.println("DONE!!!");
				
	}
}
