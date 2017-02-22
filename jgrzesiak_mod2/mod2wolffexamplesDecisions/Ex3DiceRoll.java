package mod2wolffexamplesDecisions;

public class Ex3DiceRoll {

	
	public static void main(String[] args) {
		
		/* We want to create a random number between 1 and 6
		 * There is a method in the Math class named random() that creates an integer value between 0 and 1
		 * So ---you could do  double x = Math.random()   to get a random number between 0 and 1.
		 * But we want an integer value between 1 and 6
		 * So first we multiply the value by 6 (and now have double between 0 and 5.9999
		 * Then we add one to it (and now have values between 1 and 6.9999)
		 * We would like to just "chop" off the value to get numbers between 1 and 6
		 * We could do that if we could take only the integer (or whole number) part of the number
		 * We do that with a technique called "casting" (google that) 
		 * We cast the value to a integer by writing the new data type in parentheses in front of the expression
		 */
		
		int c1 = (int) (Math.random()*6) +1;
		int c2 = (int) (Math.random()*6) +1;
		int p1 = (int) (Math.random()*6) +1;
		int p2 = (int) (Math.random()*6) +1;
		
		System.out.println("Computer first number:" + c1);
		System.out.println("Computer second number:" + c2);
		System.out.println("My first number:" + p1);
		System.out.println("My second number:" + p2);
		
		int cTotal = c1 + c2;
		int pTotal = p1 + p2;
		
		if (cTotal > pTotal)
			System.out.println("Computer wins!");
		else if (cTotal == pTotal)
			System.out.println("Tie");
		else
			System.out.println("You win!");
	
	}

}
