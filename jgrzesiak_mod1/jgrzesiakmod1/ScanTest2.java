package jgrzesiakmod1;

import java.util.Scanner;



public class ScanTest2 {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		//to read from the keyboard, you need two lines of code.
		// The first is the prompt
		// The second is the line that picks the data up from the keyboard
		
		System.out.println("How old are you?");
		int myAge = scan.nextInt();
		
		System.out.println ("What is your hourly wage?");
		double hrWage = scan.nextDouble();
		//MORAL OF THE STORY!  ALWAYS USE SCAN.NEXTLINE() ---NEVER USE SCAN.NEXT()
		//AND AFTER READING A PRIMITIVE DATA TYPE (int or double), 
		//ADD AN EXTRA SCAN.NEXTLINE() BEFORE READING A STRING!!

		scan.nextLine();
		System.out.println("What is your name?");
		String name = scan.nextLine();
		
		System.out.println(name + " is " + myAge + " years old and makes " + hrWage + " per hour.");
	

	}

}
