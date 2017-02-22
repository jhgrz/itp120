package basicConstructs;

import java.util.Scanner;
import java.text.NumberFormat;

public class Commission {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		double sale = 0;
		double commission = 0;
		final double rateOne = .03;
		final double rateTwo = .05;
		final double rateThree = .08;
		final double salary = 200.00;
		double totalSalary = 0;
		int salesPeopleCounter = 0;
		double accumTotalSalary = 0;

		while (sale != -999) {
			// Collect each Sales person's sales input
			System.out.println("Enter sales amount (-999 to end) :");
			sale = scan.nextInt();

			if (sale == -999) {
			} 
			else {

				// Calculate commission
				if (sale <= 500) {
				} 
				else if (sale <= 1000) {
					commission = (sale - 500) * rateOne;
				}
				else if (sale <= 3000) {
					commission = (sale - 1000) * rateTwo + (rateOne * 500);
				}
				else if (sale > 3000) {
					commission = (sale - 3000) * rateThree + (rateOne * 500) + (rateTwo * 2000);
				}

				// Calculate total salary
				totalSalary = salary + commission;

				// Print commision and salary to console
				System.out.println(
						"You earned " + nf.format(commission) + " for a total " + nf.format(totalSalary) + ".");

				// Counter
				salesPeopleCounter++;

				// Accumulate all total Salaries
				accumTotalSalary = accumTotalSalary + totalSalary;

			} // Close primary else
		} // Close while loop

		// Print final accumulation
		System.out.println("The number of employees is " + salesPeopleCounter + " and the total payout is "
				+ nf.format(accumTotalSalary));

	}

}
