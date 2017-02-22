package itp120mod4.Ex3.classes;



import java.text.*;
import java.util.*;
public class StockDriver {

	public static void main(String[] args) {
		
		boolean more = true;
		
		Scanner scan = new Scanner(System.in);
		NumberFormat money = NumberFormat.getCurrencyInstance();
		
		while (more)
		{
			/* NOTE : in the next four comments, you will need two lines per comment
			  one for the prompt and one for the answer.  Make certain your choice
			  of data types for each is the same as the associated field in Stock*/
			
			// ask for the Customer ID and store the answer in the variable named custNum
			// ask for the name of the stock and store the answer in the variable named type
			// ask for the number of shares and store the answer in the variable named num
			// ask for how much was paid per share and store the answer in the variable named paid
			// ask for the current value per share and store the answer in the variable named current
			
			
			
			// create a Stock instance named stock by calling the full constructor
			
			// call the calcCost method on the stock instance  (-- NOTE - this is in the Stock class!!)
			//	and store the answer in the double variable grossAmt
			
			// call the calcCurrentValue method on the stock instance and store the answer in the double
			// variable named currentAmt
			
			
			// print out the toString() method on the stock instance
			
			
			System.out.println("The total cost of the stock is " + money.format(grossAmt) + 
					" and the current value is " + money.format(currentAmt));
					
			
			System.out.println ("More stocks to calculate? (true or false)");
			more = scan.nextBoolean();				
			
		}
		
		
		
	}
		
		
		
}


