package jgrzesiakmod2;

import java.util.Scanner;

public class BirdDriver {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// create a bird instance or object  (call the constructor)
		Bird b = new Bird();
		
	    // print that bird out
		System.out.println(b.toString());
		
		// create a bird using the full constructor		
		Bird b2 = new Bird("Misha", "cockatoo", 29);
		
		//print this one out.
		System.out.println(b2.toString());
		
		System.out.println("Name:");
		String name = scan.nextLine();
		System.out.println("Breed:");
		String br= scan.nextLine();
		System.out.println("Age:");
		int a = scan.nextInt();
		
		Bird b3 = new Bird(name,br,a);
		System.out.println(b3.toString());
		
		// set some values for b bird
		b.setName("Annie");
		b.setBreed("greenwing macaw");
		b.setAge(4);
		
		System.out.println(b.toString());
		
		// this does not work.  Make certain it is object.method() --- not class.method()
		//Bird.setName("Joe");
		
		Bird b4 = new Bird ("Nicky");
		//note the value that print in the next line for instance variables that I do not set
		System.out.println(b4.toString());
		// I can now set them
		b4.setBreed("hyacinth macaw");
		b4.setAge(17);
		System.out.println(b4.toString());
		
		
		
		
		
		

	}

}
