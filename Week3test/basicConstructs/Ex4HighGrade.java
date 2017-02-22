package basicConstructs;

import java.util.Scanner;

public class Ex4HighGrade {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int grade = 0;
		int numGrades=0;
		int total=0;
		int highGrade = -1;
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
			 
			 if (grade!=999)
			 {
				 numGrades++;
				 total = total + grade;
				 if (grade > highGrade)
					 highGrade = grade;
			 }
			System.out.println("Welcome to my class!");
			
		}  //end of while
		double ave = total / numGrades;
		System.out.println("The average grade was " + ave);
		System.out.println("The high grade was " + highGrade);
	}


}
