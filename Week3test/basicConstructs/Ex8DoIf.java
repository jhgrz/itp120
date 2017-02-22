 
 
package basicConstructs;
import java.util.Scanner;


public class Ex8DoIf {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// we will average some grades.  We do not know how many grades there are ahead of time
		// that is why we choose to use do (or while) but not for
		double average =0;
		int total = 0;		// our accumulator
		int numGrades = 0;	// our counter
		char grade ;		// could have used a boolean (see Fors.java)
		int yourGrade;
		
		// use a do loop to collect the grades.  Would have been better to use a while
		do
		{
			System.out.println("Input a grade (0-100) - -1 to end"); // -1 is called a sentinel - a value that ends it
			yourGrade = scan.nextInt();
			if (yourGrade==-1)				// not great code but you do not want this grade averaged in
				break;						// would not have had that problem if you had used a while
			
			total = total + yourGrade;		// accumulator
			numGrades++;					// counter
			
		} while (yourGrade !=-1);				// != means not equal to
		
		average = total / numGrades;	// calculates the average
		
		if (average>=90)
			grade = 'A';			// single quotes for character data types
		else if (average>=80)		// note we do not need to say between 80 and 90 since above 90 would be picked up by the if above
			grade = 'B';
		else if (average>=70)
			grade = 'C';
		else if (average>=60)
			grade = 'D';
		else 						// default value
			grade = 'F';
			
		System.out.println("Your average was " + average + " for a grade of " + grade);				
			
	}
}
