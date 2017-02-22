package jgrzesiakmod1;
// we need to import any class that is not in the current package
// or in java.lang
import java.util.Scanner;
import java.text.NumberFormat;
public class ScanTest3 {
	
	public static void main(String[] args)
	{
		// we need to create an instance of the Scanner class
		Scanner scan = new Scanner(System.in);
		
		// we are going to sell items with a 20% discount
		// we will assume that this 20 is a constant (see page 70-71 in your text)
		final double DISCOUNT = 0.20;
		
		System.out.println("What is the name of the item?");
		// since we would expect a String, we try the next() method.  But when you run the program,
		// fill in "Blue Widgets" and see what happens.
		//Moral of the story:  Always use scan.nextLine() and never scan.next()
		String name = scan.next();
		
		System.out.println("Give me a number representing the number of items ");
		// since we would expect an integer number, we will use the nextInt() method
		int numItems = scan.nextInt();
		
		System.out.println("Give me a price for each item ");
		//since we would be expecting a decimal number, we will use the nextDouble() method
		double costEach = scan.nextDouble();
		
		// now do the calculations
		double cost = numItems * costEach * (1-DISCOUNT);
		
		// now print the information out
		System.out.println ("You bought " + numItems + " " + name + " and each cost " + costEach);
		System.out.println("\tThe discount was " + DISCOUNT*100 + " %and the total cost was " + cost);
		
		// now let's use the NumberFormat class from chapter 3 to make it look nicer
		// get the currency instance for the NumberFormat class (not the import statement at the top)
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		// and apply the format method to the output
		System.out.println ("You bought " + numItems + " " + name + " and each cost " + nf.format(costEach));
		System.out.println("\tThe discount was " + DISCOUNT*100 + " %and the total cost was " + nf.format(cost));
		
		
		
		
		
	}

}
