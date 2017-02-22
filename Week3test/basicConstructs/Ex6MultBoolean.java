
package basicConstructs;
import java.text.*;
import java.util.Scanner;

 
public class Ex6MultBoolean {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		boolean more=true;			// you could use a boolean, char, or even a String to check the loop
		double gross;				// could initialize but do not have to since we are calculating this
		double total=0;				// must initialize it since we need to start the total at zero
		NumberFormat nf = NumberFormat.getCurrencyInstance();  // can put this anywhere before you use it
		while (more)				// we use a boolean since we do not know how many employees there are
		{
			// remember - takes two lines to get a piece of data from the keyboard
			System.out.println("How many hours did this person work?");
			double hours = scan.nextDouble();
			
			System.out.println("What is the hourly wage?");
			double wage = scan.nextDouble();
			
			System.out.println("Does this period qualify for holiday?(Y or N)");
			String  strHoliday = scan.next();
			char holiday = strHoliday.charAt(0);
			
			// NOTE: we are assuming that all week is either a holiday or not---cool!
			
							
			if (holiday=='Y' && hours >40)			// &&=AND - BOTH have to be true for this choice
				gross = ((40 * wage) + (hours-40) * wage * 1.5) * 2.0;
			else if (holiday == 'Y' && hours <= 40)
				gross = hours * wage ;	
			else if (holiday == 'N' && hours > 40)
				gross = 40 * wage + (hours-40) * wage * 1.5;
			else									// the default
				gross = hours*wage;
			
			total = total + gross;
				
			System.out.println("This person worked " + hours + " hours and made " + nf.format(gross) + " salary");
			System.out.print ("It ");
			  			if (holiday=='Y')				// comes in the middle of printing a line
				System.out.print("was ");
			else
				System.out.print("was not ");
							System.out.println("a holiday season.");							
				
			System.out.println("More to calculate? (true or false)");
			more = scan.nextBoolean();	
			
		}
		System.out.println ("The total salary paid was " + nf.format(total));
	}
}
