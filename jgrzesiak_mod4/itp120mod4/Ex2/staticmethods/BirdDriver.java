package itp120mod4.Ex2.staticmethods;

public class BirdDriver {

	public static void main(String[] args) {
		//in the main method in the driver, you want to CALL methods ---not DEFINE methods
		
		//a method call looks like this.  I am calling the no argument constructor		
		Bird b = new Bird();
		
		//now I am calling the full constructor
		Bird bb = new Bird("amazon", "Joe");
		
		// the code below gives an error because you are trying to DEFINE a method inside another method
		/*public Bird()
		{
			
		}*/    
		
		
		// I am inside of main so I cannot write a method definition here
		
		// But I can call methods.  So let's call printBirds().  Since it is in the same class, just call it!
		// It does not return a value so there is no left hand side to store a returned value
		printBirds();
		//call moreBirds.  It is also in the same class so just call it.  But it does return a value
		// so I need to create a location to store the value that is returned.
		String answer = moreBirds(b,bb);
		//and now I can print out the returned value.
		System.out.println(answer);
		
		// call the setBird() method.  It is in a different class so you need to do object.method().
		// it returns void so you can NOT have a left side to the code		
		 b.setName("Babs");
		 
		 // call the getName() method.  It is in a different class so you need to do object.method()
		 // it returns a value so you should store it somewhere.
		 String who = b.getName();
		 //now I can print it.
		 System.out.println(who);
	}
	
	// can put other method definitions here since I am outside of the main method!!
	public static void printBirds()
	{
		System.out.println("I am in printBirds");
	}
	
	public static String moreBirds(Bird b1, Bird b2)
	{
		System.out.println("\nPrinting out the birds...");
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		return"returning from 'more Birds\n'";
		
	}

}
