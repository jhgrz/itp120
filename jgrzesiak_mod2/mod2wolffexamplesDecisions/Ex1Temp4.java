package mod2wolffexamplesDecisions;

import java.util.Scanner;

public class Ex1Temp4 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("How hot is it out today?");
		int temp = scan.nextInt();
		if (temp >= 100) {
			System.out.println("It is hot out!");
			System.out.println("Go to the beach!");
		}  // end if
		else if (temp >=70  )
			System.out.println("It is warm");
		else	{	// default - you cannot put stipulations here
			System.out.println("It is ok");
			System.out.println("Stay home");
		}
		// jumps to here
	}

}
