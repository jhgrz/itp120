package mod2wolffexamplesDecisions;

import java.util.Scanner;

public class Ex5CompareStrings {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your favorite sport?");
		String answer = scan.nextLine();
		if(answer.equals("baseball") || answer.equals("football"))
			System.out.println("That is a good sport!");
		else if (answer.equals("basketball"))
			System.out.println("You must like tall people");
		else
			System.out.println(answer + " is a good sport also");
		
		

	}

}
