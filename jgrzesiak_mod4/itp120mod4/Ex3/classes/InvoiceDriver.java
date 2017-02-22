package itp120mod4.Ex3.classes;

import java.text.*;
import java.util.*;

public class InvoiceDriver {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char more = 'y';
		// we are going to keep two accumulators
		// we will look at these in more detail in the next module
		// but I put them here so you can begin to see how they work.
		// create a variable to accumulate the number of items
		int totalNum = 0;
		//create another one to accumulate the total value
		double totalNet = 0;
		NumberFormat money = NumberFormat.getCurrencyInstance();
		
		// we will look at the loops in detail in the next module
		while (more == 'y')
		{
		
			// input
			System.out.println("Item name:");
			String name = scan.nextLine();
			System.out.println("Price each:");
			double price = scan.nextDouble();
			System.out.println("Number:");
			int num = scan.nextInt();
			
			// create instance
			Invoice inv = new Invoice(name,price,num);
			
			// calculations
			double gross = inv.cost();
			double netCost = inv.net();
			
			// update the accumulators
			totalNum = totalNum + num;
			totalNet = totalNet + netCost;
			
			
			// output
			System.out.println(inv.toString() + "\n\t  The gross price was " + money.format(gross) 
			                         + " and the net amount was " + money.format(netCost) );
			//  the next line is needed when reading Strings after primitive types
			//and read a String in next
			scan.nextLine();
			more = ' ';
			// some data validation.  We will look at this in more detail laterS
			while(more !='y' && more !='n')
			{
				System.out.println("More to calculate? (y or n)");
				String strMore = scan.nextLine();
				more = strMore.charAt(0);
			}	
			
			
		}  // end of while
		
		// print out the accumulators
		System.out.println("You bought " + totalNum + " total items for a net cost of " + money.format(totalNet));
	
	}
	
	
}
