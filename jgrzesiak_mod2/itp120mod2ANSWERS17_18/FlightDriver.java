package itp120mod2ANSWERS17_18;

public class FlightDriver {

	public static void main(String[] args) {
		Flight f1 = new Flight("Delta", "D254", "Roanoke, VA", "San Diego, CA", 560);
		Flight f2 = new Flight("US Airways", "US876", "Chicago, IL", "Miami, FL", 340);
		Flight f3 = new Flight("United", "UA445", "Phoenix,AZ", "Los Angeles, CA");
		
		System.out.println(f1.toString());
		System.out.println(f2.toString());
		System.out.println(f3.toString());
		f3.setCost(210);
		
		System.out.println(f3.toString());
		

	}

}
