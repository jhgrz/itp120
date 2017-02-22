package itp120mod4.Ex2.staticmethods;

import java.util.Scanner;

public class AddDigits {
	// ask the user for a three digit number
	//add up the value of the digits and print it out
	//ex  453  --you print out 12

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Give me a three digit number");
		int num = scan.nextInt();
		sumDigits(num);
	
	}
	
	public static  void sumDigits(int value){
		int last = value % 10;
		int rest = value /10;
		int middle = rest % 10;
		int first = rest / 10;
		int answer = last + middle + first;
		System.out.println("The sum of the digits of " +
				value + " is " + answer);
	}

}
