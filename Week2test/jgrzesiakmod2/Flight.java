package jgrzesiakmod2;
import java.text.NumberFormat;

public class Flight {
	NumberFormat money = NumberFormat.getCurrencyInstance();
	private String name;
	private String flightNumber;
	private String origin;
	private String destination;
	private double cost;
	
	//No Argument Constructor
	public Flight ()
	{
	}
	
	//Partial Constructor First 4
	public Flight (String n, String f, String o, String d)
	{
		name = n;
		flightNumber = f;
		origin = o;
		destination = d;
	}
	
	//Full Constructor
	public Flight (String n, String f, String o, String d, Double c)
	{
		name = n;
		flightNumber = f;
		origin = o;
		destination = d;
		cost = c;
	}

	//To String Method
	public String toString()
	{
		return name + " " + flightNumber + " from " + origin + " to " + destination + " costs " + money.format(cost) + " for a ticket " ;
	}
	
	//Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
	

}
