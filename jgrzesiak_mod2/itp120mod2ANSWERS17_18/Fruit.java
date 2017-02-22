package itp120mod2ANSWERS17_18;

import java.text.DecimalFormat;
import java.text.NumberFormat;


public class Fruit {
	private String name;
	private int cal;
	private double weight;
	private double cost;
	
	public Fruit(){
		
	}
	public Fruit(String name, int cal, double weight, double cost){
		this.name = name;
		this.cal = cal;
		this.weight = weight;
		this.cost = cost;
	}
	public String toString(){
		DecimalFormat df = new DecimalFormat("#0.0");
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		String message = new String("A typical " + name +" weights " + df.format(weight) + " killograms, has " + cal 
				+ " calories and costs " + nf.format(cost) + 
				" each. \n The cost per kg is " + nf.format(costPerKg()) +
				" and the calories per kg is " + df.format(calPerKg()));
		return message;
		
	}
	
	public double calPerKg(){
		return (double) cal / weight;
		
	}

	public double costPerKg(){
		return cost / weight;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCal() {
		return cal;
	}
	public void setCal(int cal) {
		this.cal = cal;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	
}
