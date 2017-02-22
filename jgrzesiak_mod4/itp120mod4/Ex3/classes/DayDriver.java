package itp120mod4.Ex3.classes;

public class DayDriver {

	public static void main(String[] args) {
		// create a Day instance with the empty constructor
		// The APIs tell me that it will be today's date
		Day d = new Day();
		// create a Day instance with the full constructor
		// Let's do Christmas of this year
		Day christmas = new Day(2012, 12, 25);

		// Let's find out how many days until Santa comes
		int numDays = christmas.daysBetween(d);

		System.out.println("There are " + numDays + " until Santa comes!");
		
		// If I borrow money on 3/7/2012 on a 90 day loan, when will it be due?
		
		Day loan = new Day(2012,3,7);
		
		System.out.println("Date borrowed: " + loan.toStringF());
		loan.advance(90);
		System.out.println("Date due: " + loan.toStringF());
		

	}

}
