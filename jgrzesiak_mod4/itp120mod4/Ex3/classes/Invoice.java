package itp120mod4.Ex3.classes;

import java.text.*;

public class Invoice  {
	
	// declare all fields - REMEMBER THE ACCESS MODIFIER - THEY NEED TO BE PRIVATE!
	private String itemName;
	private double priceEach;
	private int number;
	
	// NOTE: money below is not really a field and you should not
	// generate getters and setters for these or any constants
	// that you declare
	NumberFormat money = NumberFormat.getCurrencyInstance();	
	
	// two constructors
	public Invoice()
	{
	}
	
	public Invoice(String i, double p, int n)
	{
		itemName = i;
		priceEach = p;
		number = n;
	}
	
	// The toString method is always required
	public String toString()
	{
		return "You bought " + number + " " + itemName + " costing " + money.format(priceEach) + " each.";
	}
	// we write an equals method to determine if two items are equal
	// we will see more on this later --- but look at the one below and
	// see if you can follow the code.  We do not use this method in this module
	
	public boolean equals(Invoice i)
	{
		if (i.getItemName().equals(this.getItemName()))
			return true;
		else
			return false;	
	}
	
	
	// other defined methods
	public double cost()
	{
		double amount;
		amount= number * priceEach;
		return amount;
		
		// return number * priceEach;     would also work.
	}
	
	public double net()
	{
		double amount;
		double gross = number * priceEach;
		if(number>20)
			amount = gross*.75;
		else if (number>10)
			amount = gross * .85;
		else
			amount = gross;	
			
		return amount;		
		
	}

	/**
	 * @return
	 */
	public String getItemName() {
		return itemName;
	}

	/**
	 * @return
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * @return
	 */
	public double getPriceEach() {
		return priceEach;
	}

	/**
	 * @param string
	 */
	public void setItemName(String string) {
		itemName = string;
	}

	/**
	 * @param i
	 */
	public void setNumber(int i) {
		number = i;
	}

	/**
	 * @param d
	 */
	public void setPriceEach(double d) {
		priceEach = d;
	}

}
