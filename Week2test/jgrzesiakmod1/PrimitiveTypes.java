/*
 * Created on 01/17/17
 * John Grzesiak
 */
package jgrzesiakmod1;

public class PrimitiveTypes {

	public static void main(String[] args) {
	
		//declare variables
		String itemName;
		double costEach;
		int numberPurchased;
		double totalPrice;
	
		//value assignment
		itemName = "Banana";
		costEach = .25;
		numberPurchased = 8;
		
		//expression
		totalPrice = numberPurchased * costEach;
	
		//output
		System.out.println("You Purchased" + " " + numberPurchased + " " + itemName + " " 
		+ "for" + " " + costEach + " for a total cost of " + totalPrice);
	}

}