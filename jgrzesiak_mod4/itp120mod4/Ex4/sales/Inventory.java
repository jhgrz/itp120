
package itp120mod4.Ex4.sales;


public class Inventory {
	
	private String itemName;
	private int numInStock;
	private double cost;
	private double salesPrice;
	private double profitOnStock;
	
	public Inventory()
	{
	}
	
	public Inventory(String i, int n, double c, double s)
	{
		itemName=i;
		numInStock = n;
		cost = c;
		salesPrice = s;
		profit();
	}
	
	public String toString()
	{
		String s= "There are " + numInStock + " " + itemName + " in stock";
		s = s + "   Cost: " + cost + "  SalesPrice: " + salesPrice + "   Profit available: " + profitOnStock;
		return s;
	}
	
	public String toStringC()
	{
		return itemName + " Cost:" + salesPrice;
	}
	
	public double costValue()
	{
		return numInStock * cost;
	}
	
	public double salesValue()
	{
		return numInStock * salesPrice;
	}
	
	public void profit()
	{
		double cost = costValue();
		double sales = salesValue();
		profitOnStock = sales - cost;
	}

	/**
	 * @return
	 */
	public double getCost() {
		return cost;
	}

	/**
	 * @return
	 */
	public String getItemName() {
		return itemName;
	}

	/**
	 * @return
	 */
	public int getNumInStock() {
		return numInStock;
	}

	/**
	 * @return
	 */
	public double getSalesPrice() {
		return salesPrice;
	}

	/**
	 * @param d
	 */
	public void setCost(double d) {
		cost = d;
	}

	/**
	 * @param string
	 */
	public void setItemName(String string) {
		itemName = string;
	}

	/**
	 * @param i
	 */
	public void setNumInStock(int i) {
		numInStock = i;
	}

	/**
	 * @param d
	 */
	public void setSalesPrice(double d) {
		salesPrice = d;
	}

}
