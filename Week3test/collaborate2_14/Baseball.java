package collaborate2_14;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Baseball {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// top loop

		// you cannot use operators (< > <= >= == !=) for Strings or any object
		// you can only use them for int, double, booleans, char
		DecimalFormat df = new DecimalFormat("#.000");
		DecimalFormat df2 = new DecimalFormat("#.0");
		// declare and initialize your accumulators
		int totBats = 0;
		int totHits = 0;
		int totOuts = 0;

		// declare a counter
		int numGames = 0;

		String more = "yes";

		while (more.equals("yes")) {
			more = "";
			System.out.println("How many at bats?");
			int bats = scan.nextInt();
			totBats = totBats + bats;

			System.out.println("How many hits?");
			int hits = scan.nextInt();
			totHits = totHits + hits;

			System.out.println("How many strike outs?");
			int outs = scan.nextInt();
			totOuts = totOuts + outs;

			numGames++; // numGames = numGames + 1;

			System.out.println("There were " + bats + " at bats with " + hits
					+ " hits and " + outs + " strike outs");

			scan.nextLine();
			while (!more.equals("yes") && !more.equals("no")) {
				
				System.out.println("More games (yes or no)");
				more = scan.nextLine();
			}

		}// bottom of loop

		System.out.println("There were " + totBats + " at bats with " + totHits
				+ " hits and " + totOuts + " strike outs");

		double batAve = totHits * 1.0 / totBats;
		double pctStrikeOut = totOuts * 100.0 / totBats;

		System.out.println("The batting average is " + df.format(batAve)
				+ " and the percentage of strike outs is "
				+ df2.format(pctStrikeOut));

	}

}
