
package itp120mod4.Ex4.sales;


public class Sales {
	
	private Customer cust;
	private Inventory inv;
	private int numBought;
	
	public Sales()
	{
	}
	
	public Sales (Customer c, Inventory i, int n)
	{
		cust = c;
		inv = i;
		numBought = n;		
	}
	
	public String toString()
	{
		return cust.toString() + " bought " + numBought + " "+ inv.toStringC(); 
	}

	/**
	 * @return
	 */
	public Customer getCust() {
		return cust;
	}

	/**
	 * @return
	 */
	public Inventory getInv() {
		return inv;
	}

	/**
	 * @return
	 */
	public int getNumBought() {
		return numBought;
	}

	/**
	 * @param customer
	 */
	public void setCust(Customer customer) {
		cust = customer;
	}

	/**
	 * @param inventory
	 */
	public void setInv(Inventory inventory) {
		inv = inventory;
	}

	/**
	 * @param i
	 */
	public void setNumBought(int i) {
		numBought = i;
	}

}
