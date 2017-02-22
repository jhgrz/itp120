package jgrzesiakmod2;

// we will be using a class named NumberFormat to make our output look like money
// it is in the java.text package so we need to import it
import java.text.NumberFormat;

public class MoneyExample {

	
	public static void main(String[] args) {
		
		// create an instance of the Numberformat class
		NumberFormat money = NumberFormat.getCurrencyInstance();
		double value = 123.456;
		// for any output that you want to look like money, wrap a money.format() method call around it
		System.out.println("The output looking like money is " + money.format(value));

	}

}
