package collaborate2_14;

import java.util.Scanner;
/*
 * Regressive property tax calculation.  Your county taxes are based on the following rates:
3.5% of the first $100,000 – used for trash pickup, etc.
2.0% on the next $50,000 and 
1.5% of the anything over $150,000

Calculate the tax on various property values.  Sample data: 
 $120,000 = $3900   $40,000=$1400    $210,000 = $5400

 */

public class PropertyTax {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		

		// initialize counters		
		int numCheap = 0;  // how many properties are worth <=100000
		int numMiddle = 0; // how many between 100000-150000
		int numRich = 0;  //how many >150000
		
		// initialize an accumulator
		double totalTax = 0;
		
		
		System.out.println("How much is your property worth?");
		int value = scan.nextInt();
		int x;
		double tax;
		
		
		if (value <=100000) {
			tax = value * 0.035;
			numCheap++;
		}
		else if (value <=150000) {
			tax = 0.035 * 100000 + 0.02 * (value-100000);
			numMiddle = numMiddle + 1;
		}
		else {
			tax = 0.035 * 100000 + 0.02 * 50000 + 0.015 * (value -150000);
			numRich++;
		}
		
		totalTax = totalTax + tax;
		
		/*if (value>=150000)
			x=0;
		else if (value >=100000)
			x=0;
		else
			x=0;
			*/
		
			
		
		
		
		

	}

}
