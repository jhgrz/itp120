package jgrzesiakmod2;
import java.text.NumberFormat;
// from the power points recording for chapter 8
public class Book {
	
	NumberFormat money = NumberFormat.getCurrencyInstance();
	private String title;
	private int numInStock;
	private double cost;
	private int stockNum;
	
		
	public Book()
	{
		
	}

	public Book(String title, int numInStock, double cost, int stockNum) {
		this.stockNum=stockNum;
		this.title = title;
		this.numInStock = numInStock;
		this.cost = cost;
		
	}
	
		
	public String toString()
	{
		return title + " with id number " + stockNum + " has " + numInStock + " books in stock costing " + money.format(cost) + " each.";
	}
	
	// other methods go here....
	//*** we will often require a equals() method and a compareTo()    method at minimum

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNumInStock() {
		return numInStock;
	}

	public void setNumInStock(int numInStock) {
		this.numInStock = numInStock;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public int getStockNum() {
		return stockNum;
	}

	public void setStockNum(int stockNum) {
		this.stockNum = stockNum;
	}
	
	


}
