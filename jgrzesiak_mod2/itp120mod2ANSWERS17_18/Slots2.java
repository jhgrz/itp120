package itp120mod2ANSWERS17_18;

public class Slots2 {

	public static void main(String[] args) {
		// initialize a count 
		int count = 1;
		
		//Continuously check until we hit a count of 16 (this number is to reproduce the sample in the assignment)
		while(count <= 16 ) {
			//add one to the count
			count++;
			// generate randon numbers up to 9.999 then casts them into integers 
			int d1 = (int) (Math.random()*10);
			int d2 = (int) (Math.random()*10);
			int d3 = (int) (Math.random()*10);
			
			// determine which numbers are the same
			if (d1 == d2 && d2 == d3) {
				System.out.println("Your numbers are " + d1 + d2 + d3 + ":    You got all " + d1 + "'s!");
			}
			else if ( d1 == d2) {
				System.out.println("Your numbers are " + d1 + d2 + d3 + ":    You got two " + d1 + "'s!");
			}
			else if ( d1 == d3) {
				System.out.println("Your numbers are " + d1 + d2 + d3 + ":    You got two " + d1 + "'s!");
			}
			else if ( d2 == d3) {
				System.out.println("Your numbers are " + d1 + d2 + d3 + ":    You got two " + d2 + "'s!");
			}
			else {
				System.out.println("Your numbers are " + d1 + d2 + d3 + ":    NO MATCHES!");
			}
		}
	}
}
