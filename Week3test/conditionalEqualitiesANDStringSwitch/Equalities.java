package conditionalEqualitiesANDStringSwitch;

import java.util.Scanner;

public class Equalities {

	public static void main(String[] args) {
		
		int x = 10;
		String name = "Diane";
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Give me a number (answer 10)");
		int y = scan.nextInt();
		scan.nextLine();
		System.out.println("Give me a name (answer Diane)");
		String name2 = scan.nextLine();
		
		
		if (x==y)
			System.out.println("Ues double equals for primitive types");
		if (name == name2)
			System.out.println ("This does not print ---Do NOT use double equals for reference types");
		if (name.equals(name2))
			System.out.println("Use methods for reference types");
		
				
				
	}

}
