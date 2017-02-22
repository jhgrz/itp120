
package jgrzesiak_mod3;
import java.text.*;
import java.util.Scanner;

 
public class Ex3Accumulator {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		//I want to get an average grade
		// I need to know the current grade	
		int grade = 0;
		// I need a counter for the number of grades
		int numGrades=0;
		// I need an accumulator to accumulate the grades
		int total=0;
		
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
			 
			 // this decision is added to make certain
			 //that the final sentinel "999" is not added in
			 if (grade!=999)
			 {
				 numGrades= numGrades + 1;
				 total = total + grade;
			 }
			System.out.println("Welcome to my class!");
			
		}  //end of while
		
		// print out summary here after the loop
		double ave = total / numGrades;
		System.out.println("The average grade was " + ave);
	}

}
