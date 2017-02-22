package basicConstructs;

import java.util.Scanner;

public class Ex5ForFor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("how many students?");
		int numStudents = scan.nextInt();
		System.out.println("how many grades each?");
		int numGrades = scan.nextInt();
		System.out.println("how many classes?");
		int numClass = scan.nextInt();
		for (int k = 0; k < numClass; k++) {
			scan.nextLine();
			int grandTotal = 0;
			for (int i = 0; i < numStudents; i++) {
				System.out.println("Name of student # " + (i + 1));
				String name = scan.nextLine();
				int totalGradeStudent = 0;
				for (int j = 0; j < numGrades; j++) {
					System.out.println("Grade # " +(j+1));
					int grade = scan.nextInt();
					totalGradeStudent = totalGradeStudent + grade;

				}// end of numGrades
				System.out.println();
				scan.nextLine();
				System.out.println(name + " has a total score of "
						+ totalGradeStudent);
				grandTotal = grandTotal + totalGradeStudent;

			} // end of numStudents

			System.out.println("The grand total is " + grandTotal);
		} // end of num classes

	}

}
