package basicConstructs;

import java.util.Scanner;

public class Ex1IfIfElse {
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter your grade: ");
		int grade = scan.nextInt();
		
		// use an if/else if/else for making a decision
		// on whether to process certain code
		// and you want to do something for each choice
		//You can use as many branches as you need
		//The last one is often the default "else" but does not 
		//have to be.
		
		if(grade>=90)
			System.out.println("You got an A");
		else if (grade >=80)
			System.out.println("You got an B");
		else if (grade >=70)
			System.out.println("You got an C");
		else
			System.out.println("You need to study harder");
		
		System.out.println("Welcome to my class!");
		
		

	}

}
