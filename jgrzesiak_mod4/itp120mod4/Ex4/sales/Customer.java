
package itp120mod4.Ex4.sales;


public class Customer {
	
	private String last;
	private String first;
	private int custNum;
	
	public static int nextNum=200;
	
	public Customer()
	{
		custNum = nextNum;
		nextNum++;	
	}
	
	
	public Customer(String last, String first)
	{
		this.last = last;
		this.first=first;
		custNum = nextNum;
		nextNum++;
	}
	
	public String toString()
	{
		return custNum + ": " + first + " " +last;
	}
	

	/**
	 * @return
	 */
	public int getCustNum() {
		return custNum;
	}

	

	/**
	 * @return
	 */
	public String getFirst() {
		return first;
	}

	/**
	 * @return
	 */
	public String getLast() {
		return last;
	}

	/**
	 * @param i
	 */
	public void setCustNum(int i) {
		custNum = i;
	}

	/**
	 * @param string
	 */
	public void setFirst(String string) {
		first = string;
	}

	/**
	 * @param string
	 */
	public void setLast(String string) {
		last = string;
	}

}
