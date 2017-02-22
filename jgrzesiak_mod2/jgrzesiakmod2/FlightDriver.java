package jgrzesiakmod2;

public class FlightDriver {

	public static void main(String[] args) {

		Flight del = new Flight ("Delta", "D254", "Roanoke, VA", "San Diego, CA", 560.00);
		Flight usa = new Flight ("US Airways", "US876", "Chicago, IL", "Miami, FL", 340.00);
		Flight uni = new Flight ("United", "UA445", "Phoenix, AZ", "Los Angeles, CA");
		
		System.out.println(del.toString());
		System.out.println(usa.toString());
		System.out.println(uni.toString());
		
		uni.setCost(210.00);
		
		System.out.println(uni.toString());


	}

}
