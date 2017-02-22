package itp120mod4.Ex1.methodsFromJavaAPIs;

import java.util.Scanner;

public class Ex3CheckValid {

// Let's say a valid password consist of the following:
	//a letter at location 0
	//a number at location 1
	//a dash at location 2
	// a special character (something other than a number or digit) at location 3
	// 3 letters - locations 4,5, and 6
	// How would I check for a valid password?
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Put in a password");
		String pass = scan.nextLine();
		// call a method to see if it is valid
		boolean isValid = valid(pass);
		//print out the results
		if (isValid)
			System.out.println("Valid");
		else
			System.out.println("Invalid");
		
		
	
	}
	
	public static boolean valid(String code){
		if (code.length() !=7)
			return false;
		
		char loc1 = code.charAt(1);
		if (!Character.isDigit(loc1))
			return false;
		char loc3 = code.charAt(3);
		if (Character.isLetterOrDigit(loc3) )
			return false;
		char loc0 = code.charAt(0);
		char loc4= code.charAt(4);
		char loc5 = code.charAt(5);
		char loc6 = code.charAt(6);
		
		if (!Character.isLetter(loc0) || !Character.isLetter(loc4)||
				!Character.isLetter(loc5)||!Character.isLetter(loc6))
			return false;
		
		char loc2 = code.charAt(2);
		if (loc2 !='-')
			return false;
		
		return true;
		
	}

}
