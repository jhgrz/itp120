package carpet;

import java.util.Scanner;
import java.text.*;

public class CarpetCalculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		RoomDimension roomD;
		RoomCarpet roomC;
		
		double totalCarpetCost = 0;
		String keepOn = "yes";
		
		while (keepOn.equalsIgnoreCase("yes")) {
			System.out.println("Please enter the length of the room:");
			double myLen = scan.nextDouble();
			System.out.println("Please enter the width of the room:");
			double myWid = scan.nextDouble();
			System.out.println("Please enter the cost per square foot for carpet:");
			double myCost = scan.nextDouble();
			
			roomD = new RoomDimension(myLen, myWid);
			roomC = new RoomCarpet(myCost, roomD);
			
			// display total cost of carpet
			System.out.println("For this room, the carpet will cost " +
				NumberFormat.getCurrencyInstance().format(roomC.getTotalCost()));
			
			totalCarpetCost += roomC.getTotalCost();
			
			scan.nextLine();
			System.out.println("If you would like to continue, enter \"yes\"");
			keepOn = scan.nextLine();
		}
		
		System.out.println("The total carpet cost for all of these rooms will be " +
			NumberFormat.getCurrencyInstance().format(totalCarpetCost) + ". Thank you!");
	}

}
