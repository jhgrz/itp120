package itp120mod2ANSWERS17_18;

public class Slots {

	public static void main(String[] args) {
		for (int i=0;i<1200;i++){
		int first = (int) (Math.random()*10) ;
		int second = (int) (Math.random()*10) ;
		int third = (int) (Math.random()*10) ;
		System.out.println ("Your numbers are " + first + second + third + ":    ");
		if (first == second && second == third) {
			System.out.println("You got all " + first + "'s!");			
		}
		else if (first == second || first == third)
			System.out.println ("You got two " + first + "'s");
		else if (second == third)
			System.out.println("You got two " + second + "'s");
		else 
			System.out.println("NO MATCHES!");
		}

	}

}
