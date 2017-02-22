package conditionalEqualitiesANDStringSwitch;

import java.util.Scanner;

public class StringSwitch {

	public static void main(String[] args) {
		//Starting in JDK7, you can now switch on Strings
        
        Scanner scan = new Scanner(System.in);
        System.out.println ("What is the name of your favorite American league baseball team? (answer with the nickname)");
        String nickName = scan.nextLine();
        switch (nickName) {
            case "Angels":
            case "Astros":
            case "Mariners":
            case "Rangers":
            case "Athletics":
                System.out.println("Your team is in the American league West");
                break;
            case "Orioles":
            case "Yankees":
            case "Red Sox":
            case "Blue Jays":
            case "Rays"	:
                System.out.println("Your team is in the American league East");
                break;
            case "Royals":
            case "Tigers":
            case "Indians":
            case "Twins":
            case "White Sox":
            	System.out.println("Your team is in the American league Central");                
                break;
            default:
                System.out.println("Invalid team.");
                break;
        }
        System.out.println("Isn't baseball fun???");




	}

}
