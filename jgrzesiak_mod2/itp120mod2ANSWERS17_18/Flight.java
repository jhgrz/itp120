package itp120mod2ANSWERS17_18;

import java.text.NumberFormat;

public class Flight {
	
	private String name;
	private String flightNumber;
	private String origin;
	private String destination;
	private double cost;
	
	
	public Flight() {
		
	}


	public Flight(String name, String flightNumber, String origin,
			String destination, double cost) {
		this.name = name;
		this.flightNumber = flightNumber;
		this.origin = origin;
		this.destination = destination;
		this.cost = cost;
	}


	public Flight(String name, String flightNumber, String origin,
			String destination) {
		
		this.name = name;
		this.flightNumber = flightNumber;
		this.origin = origin;
		this.destination = destination;
	}
	
	public String toString() {
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		return name + " " + flightNumber + " from " + origin + " to " + destination +
				" costs " + nf.format(cost) + " for a ticket";
	}


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
