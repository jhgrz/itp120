package jgrzesiak_mod3;

import java.util.Scanner;

public class Ex2_3SentinelToEnd {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		// use a while loop when you want to loop 
		// and you do not know how many times you will do so.
		// You can use a sentinel to end the loop
		// Makes it easier than always asking if there are more
		
		int grade = 0;
		while(grade !=999)
		{
			System.out.println("Enter your grade (999 to end): ");
			 grade = scan.nextInt();
			 if (grade==999)
				 System.out.println("Thanks for using my grading program");
			 else if(grade>=90)
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

}
