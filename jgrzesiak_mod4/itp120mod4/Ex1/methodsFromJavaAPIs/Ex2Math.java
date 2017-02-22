package itp120mod4.Ex1.methodsFromJavaAPIs;

// we need an import for the Scanner class
import java.util.Scanner;
// we do not need an import for the Math class since it is part of java.lang
// we need an import for the DecimalFormat class on page 132 since it is in java.text
import java.text.DecimalFormat;

public class Ex2Math {
	 
	public static void main(String[] args) {
		
		// create an instance of the scanner class
		Scanner scan = new Scanner(System.in);
		
		// read in an integer from the keyboard
		System.out.println("Give me a number between 1 and 10");
		int num=scan.nextInt();
		
		System.out.println("Your number was " + num);
		
		
		
		/* The Math class methods are static.  That means that we refer to them
		 * with Class.method() instead of object.method() like we did for the String class
		 * Check out these examples below
		 */
		System.out.println("The square root of the number is " + Math.sqrt(num));
		System.out.println("The cube of your number is " + Math.pow(num,3));
		System.out.println("the cosine of the number is " + Math.cos(num));
		
		//Now let's make the last output round to one decimal place.
		// I found a class named DecimalFormat that will accomplish this
		DecimalFormat df = new DecimalFormat("0.#");
		System.out.println("the cosine of the number is " + df.format(Math.cos(num)));
		
		

	}

}
