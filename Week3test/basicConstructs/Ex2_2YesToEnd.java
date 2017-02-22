package basicConstructs;

import java.util.Scanner;

public class Ex2_2YesToEnd {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		// use a while loop when you want to loop 
		// and you do not know how many times you will do so.
		//It is more "natural" to answer yes or no
		//But remember that Java is case sensitive
		//So the equalsIgnoreCase() method helps
		
		String more = "yes";
		while(more.equalsIgnoreCase("yes"))
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
			scan.nextLine();
			System.out.println("More grades?(yes or no)");
			more = scan.nextLine();
		}
	}

}
