package itp120mod4.Ex3.classes;

import java.text.*;

public class Stock {

	// this line is used to output money but this is NOT considered a field
	NumberFormat money = NumberFormat.getCurrencyInstance();

	// create five fields - a String called stockName, a integer called custID
	// a integer called numShares, a double named costPaid,and a double called currentValue
	// Do not forget the access modifier

	// create an empty and full constructor

	public String toString() {
		return custID + " owns " + numShares + " shares of " + stockName
				+ " worth " + money.format(currentValue) + " per share.  You paid "+ 
				money.format(costPaid) + " per share.";
	}

	// write a calcCost method that takes no parameters and returns a double
	// Have it return the  total cost you paid for the stock
	
	// write a method named calcCurrentValue that takes no parameters and returns a double
	// that is the current value of the stock.

	// write your getters and setters. You should at least once try to create
	// these by hand so you understand them
	// (even though Eclipse will write these for you)
	// (DO NOT create one for money - it really is not a field)
}
