package itp120mod4.Ex3.classes;

import java.text.NumberFormat;
import java.util.Scanner;

public class CookieDriver {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		// I want an accumulator for the total cost and one to calculate the total number of boxes
		int numBoxes = 0;
		double totalCost=0;
		
		//we will want the output to look like money
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		
		//use a String as a sentinel
		String more = "yes";
		while (more.equals("yes")) {

			//ask for the needed data
			System.out.println("What type of cookie? ");
			String type = scan.nextLine();
			System.out.println("How many boxes?");
			int numBox = scan.nextInt();			
			System.out.println("How much does each box cost?");
			double cost = scan.nextDouble();
			
			// create a Cookies instance
			Cookies cookies = new Cookies(type,cost,numBox);
			
			//print out the Cookies
			System.out.println(cookies.toString());
			
			// accumulate the number of boxes
			numBoxes = numBoxes + cookies.getNumber();
			
			double orderCost = cookies.cost();
			System.out.println("The cost of this order was " + nf.format(orderCost));
			
			//accumulate the cost
			totalCost = totalCost + orderCost;
			

			//need the next line for the Scanner problem
			scan.nextLine();
			
			System.out.println("More sales? (yes/no)");
			more = scan.nextLine();

		}// end loop
		
		//print summary
		System.out.println("Total boxes: " + numBoxes);
		System.out.println("Total collected: " + nf.format(totalCost));

	}

}
