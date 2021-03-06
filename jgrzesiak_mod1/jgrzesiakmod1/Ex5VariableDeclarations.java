package jgrzesiakmod1;

public class Ex5VariableDeclarations {

	public static void main(String[] args) {

		// declare some variables
		// whole numbers are integers (int)
		int age = 15;
		age = 30;
		
		// double is used for numbers with decimals
		double salary = 16.25;
		
		// char are used for a single keypress
		char ans = 'Y';
		//booleans are used for true/false
		boolean more = true;
		
		//DO NOT USE THE CAPITALIZED VERSION OF THESE VARIABLES
		//Double, Integer, Character, Boolean "seem" to work the same
		// but they have a ton of overhead since you are actually using
		//the class version of the variables.  Do not use these unless
		//you need their methods (more later..)
		
		//Java classes must start with a capital letter
		//There are some predefined ones that we will use lie String		
		
		// String for set of keypresses
		String firstName = "Diane";
		String lastName = "Wolff";
		
		//when declaring variables, youcan declare and initialize in one step
		int value = 10;
		//or you can declare in the first step
		double hours;
		//and initialize in the second
		hours = 42.5;
		//variable values can be changed
		hours = 50;
		
		//you can declare and calculate in one step
		double totalWages = salary * hours;
		// keep telling yourself that the = is NOT equals but is "assigns"
		// so the above line multiplies salary times hours and assigns the
		//result to a variable named "totalWages" that is of type double.
		
		//concatenate to print out the information
		System.out.println(firstName + " " + lastName + " worked " + hours
				+ " \nhours at " + salary + " for a total wage of "
				+ totalWages);
		// we will later see how to make totalWages look like money

		// this next line prints but stays on the same line (print versus println)
		System.out.print("Hello");
		//this line includes the carriage return
		System.out.println("Bye");
		System.out.println("Later!");

	}

}
