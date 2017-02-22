package jgrzesiakmod1;
import java.util.Scanner;

//MORAL OF THE STORY!  ALWAYS USE SCAN.NEXTLINE() ---NEVER USE SCAN.NEXT()
//AND AFTER READING A PRIMITIVE DATA TYPE, ADD AN EXTRA SCAN.NEXTLINE() BEFORE READING A STRING!!


public class ScanTest {

	public static void main(String[] args) {
		// the scanner class works fine for primitive data types
		// see the ones below
		//note - there is no method for the char data type
		// look at the GasMileage program to see how I handled that
		Scanner scan = new Scanner(System.in);
		System.out.println("Gove me an integer");
		int x = scan.nextInt();
		System.out.println("Give me a double");
		double y = scan.nextDouble();
		System.out.println("Answer with true or false");
		boolean ans = scan.nextBoolean();
		
		// the problem occurs when reading in Strings after
		// you have read in primitive types
		//   whether there are spaces or not
		// add the scan.nextLine(); before reading the String to eliminate the problem
		scan.nextLine();
		System.out.println ("Type in  your first name");
		// but you do not want to put one between each reading of a String
		String name = scan.nextLine();
		System.out.println("Type in  your last name");
		String last = scan.nextLine();
		System.out.println("Type in your street address");
		String add=scan.nextLine();
		
		// and do not add an extra scan.nextLine() after reading a String before reading a primitive
		// you can then read more primitives with no problem
		System.out.println("Give me a number between one and ten");
		int num = scan.nextInt();
		// but add the scan.nextLine(); before any Strings
		scan.nextLine();
		System.out.println("Type in some text with spaces in it");
		String junk = scan.nextLine();
		//note- the problem is not with primitives after Strings
		// it is with strings after primitives
		System.out.println("Now type in any double");
		double number = scan.nextDouble();
		scan.nextLine();
		
		
		//beware with loops when you loop back the second time
		//in the loop below, the last thing that is read is the boolean variable named more
		//when it loops to the top it will be reading a String
		//so --- we need the scan.nextLine() at the bottom of the loop.
		boolean more = true;
		while (more)
		{
			System.out.println("Name an animal:");
			String aName = scan.nextLine();
			System.out.println("Give me a number:");
			int value = scan.nextInt();
			System.out.println("The animal is " + aName + " and the number is " + value);
			System.out.println("More?(true/false)");
			more = scan.nextBoolean();
			scan.nextLine();
			
		}
		
		System.out.println("We are done!!!");
		
		
	
	}

}
