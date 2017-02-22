package collaborate2_14;
import java.util.Scanner;

public class Ex5ForAsAWhile {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int grade = 0;
		int numGrades;
		int total=0;
		int highGrade = -1;
		System.out.println("How many students are there?");
		numGrades = scan.nextInt();
		
		// use a for loop when you know how many times 
		// that you want to loop
		
		//for(int index = 0; index < numGrades; index++)
		
		int index = 0;
		while (index <numGrades)
		{
			System.out.println("Enter the grade for student number " + (index+1) + ":");
			 grade = scan.nextInt();
			 //if (grade==999)
				 //System.out.println("Thanks for using my grading program");
			 if(grade>=90) 
				System.out.println("You got an A");
			 else if (grade >=80)
				System.out.println("You got an B");
			 else if (grade >=70)
				System.out.println("You got an C");
			 else
				System.out.println("You need to study harder");
			 
			 //if (grade!=999)
			// {
				 //numGrades++;
				 total = total + grade;
				 if (grade > highGrade)
					 highGrade = grade;
			 //}
			System.out.println("Welcome to my class!");
			index++;
			
		}  //end of while
		double ave = total / numGrades;
		System.out.println("The average grade was " + ave);
		System.out.println("The high grade was " + highGrade);
	}


}
