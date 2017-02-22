package itp120mod4.Ex2.staticmethods;

import java.util.Scanner;

public class Charges {
	
	//buy stuff
	// input cost each and number purchased
	//give a discount of 10% if you buy over 10
	// give an additional 10% if you are over 65

	public static void main(String[] args) {
		
		
		//start of loop
		// input
		Scanner scan = new Scanner(System.in);
				System.out.println("How many did you buy?");
		int num = scan.nextInt();
	
		System.out.println("How much did each cost?");
		double cost = scan.nextDouble();
		System.out.println("Are you over 65? true or false");
		boolean old = scan.nextBoolean();
		
		//use method calls to call the method
		//the data supplied are called arguments
		//the arguments and parameters must match in number and data type
		
		// calculate the gross cost
		double gross = grossCost(num, cost);
		// give the discount for over 10
		double numDisc=discountNum(num, gross);
		//give the discount for senior
		double oldDisc = discountOld( old,gross);
		//print out the info
		print(gross, oldDisc, numDisc);
		
		//end loop
	
	}
	
	// make certain there are no methods inside of a method
	
	/* for methods, you need to consider
	 * a.  the access modifiers  - public static
	 * b.  the return type  -- it depends
	 * c.  the name  - make it significant and follow camel case
	 * d.  any data needed for the method  -- called parameters - go in ( )
	 * when you list a parameter, you put the data type and the parameter name
	 */
	
	//method definitions - they define what the method is doing
	//gross cost
	public static double grossCost(int numBought, double costEach){
		double total = numBought * costEach;
		return total;
	}
	
	public static double discountNum (int numBought, double gross) {
		final int DISCNUM = 10;
		final double RATE = .05;
		double discount =0;
		if (numBought>DISCNUM)
			discount = RATE * gross;
				
		return discount;
		
	}
	
	public static double discountOld(boolean aged, double gross){
		final double RATE = .10;
		double discount;
		if (aged==true)
			discount = gross * RATE;
		else
			discount = 0;
		return discount;
			
	}
	
	public static void print(double gross, double ageD, double numD) {
		double net = gross - ageD - numD;
		System.out.println(" The gross amount was " + gross);
		System.out.println("The net amount was " + net);
	}
	
	

}
