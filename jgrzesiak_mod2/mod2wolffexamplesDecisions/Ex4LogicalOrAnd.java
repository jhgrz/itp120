package mod2wolffexamplesDecisions;

import java.util.Scanner;

public class Ex4LogicalOrAnd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your annual salary?");
		int salary = scan.nextInt();
		System.out.println("How many years have you been on the job?");
		int years = scan.nextInt();
		
		if (salary>30000 && years > 5){
			System.out.println("You qualify for the best rate we have!");
		}
		else if (salary >30000 || years >5)
			System.out.println("You can get a good rate from us");
		else
			System.out.println("You do not qualify for a loan");

	}

}
