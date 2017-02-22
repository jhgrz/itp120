package mod2wolffexamplesDecisions;

import java.util.Scanner;

public class Ex1Temp1 {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("How hot is it out today?");
		int temp = scan.nextInt();
		if (temp > 100) {
			System.out.println("It is hot out!");
		
		}
		
		// in both cases it continues here
	}

}
