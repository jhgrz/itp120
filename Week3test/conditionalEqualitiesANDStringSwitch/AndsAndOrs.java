package conditionalEqualitiesANDStringSwitch;

public class AndsAndOrs {

	public static void main(String[] args) {
		// short circuit evaluation - what that means is that Java does not analyze the second one
		// if the first one gives the answer.
		
		int x = 10;
		int y = 12;
		int z = 2;
		
		
		//Make certain to get the priority right - AND is evaluated before OR
		
		if (x==10 || x==y  && z==3  )
			System.out.println("Version 1 is true!");
		if ((x==10 || x==y)  && z==3  )
			System.out.println("Version 2 is true!");
		if (x==10 || (x==y  && z==3)  )
			System.out.println("Version 3 is true!");
		
		
		
		
		// short circuit OR evaluation - what that means is that Java does not analyze the second and 
				// third one if the first one gives the answer.  Since the first one is true, it does
				//not even care that they last one divides by zero so no runtime error occurs
		if(z<x || x<y || x/0==5)
			System.out.println("The first expression is true and since these are ORs, the second and third ones are not even tested");
		

			// Not short circuit (uses | instead of ||) so all three are analyze even if the first
		// one makes the conditional statement true.  So we get a runtime divide by zero exception thrown
		if(z<x | x<y | x/0==5)
			System.out.println("Throws a java.lang.ArithmeticException / by zero");
		
		
		
		// Now comment out lines 22 and 23
		
		// short circuit AND evaluation.  If the first one is false, it does not need to even look at the others
		if(y<x && z==2 && y/0==z)
			System.out.println("The first one is false and since these are ANDs, the others are not tested");
		
		//Not short circuit (uses & instead of &&) so all are analyzed even if the first is false
		if(y<x & z==2 & y/0==z)
			System.out.println("Throws a java.lang.ArithmeticException / by zero");
	}

}
