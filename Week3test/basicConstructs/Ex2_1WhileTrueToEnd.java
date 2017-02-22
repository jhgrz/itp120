package basicConstructs;
import java.util.*;

public class Ex2_1WhileTrueToEnd {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		// use a while loop when you want to loop 
		// and you do not know how many times you will do so.
		//You can use a boolean for deciding when to quit
		
		boolean more=true;
		while(more == true)
		{
			System.out.println("Enter your grade: ");
			int grade = scan.nextInt();
			if(grade>=90)
				System.out.println("You got an A");
			else if (grade >=80)
				System.out.println("You got an B");
			else if (grade >=70)
				System.out.println("You got an C");
			else
				System.out.println("You need to study harder");
			System.out.println("Welcome to my class!");
			System.out.println("More grades?(true/false)");
			more = scan.nextBoolean();
		}
		
		

	}
}
