
package itp120mod4.Ex4.sales;

import java.util.*;
public class SalesDriver {
	
	static Customer c1 = new Customer("Mouse", "Mickey");
	static Customer c2 = new Customer("Duck", "Donald");
	static Inventory i1 = new Inventory("Widgets", 100, 45.00, 55.00);
	static Inventory i2 = new Inventory("Junk", 200, 13.35, 21.00);
		

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);	
		
		
		boolean more = true;
		while (more)
		{
			
			System.out.println(c1.toString());
			System.out.println(c2.toString());
			System.out.println(i1.toString());
			System.out.println(i2.toString());
			
			Sales s1 = new Sales();
			makeSale(s1);
			if (s1.getNumBought()!=0)
				printInv(s1);	
		
			System.out.println("More sales? (true or false)");
			more = scan.nextBoolean();	
		}
		
		
		
	}	
		
	public static void makeSale(Sales s)
	{	
		Scanner scan = new Scanner(System.in);	
		Customer cust;
		System.out.println("Is the sale for Mickey or Donald?");
		String name = scan.next();
		if (name.equals ("Mickey"))
			cust = c1;
		else
			cust=c2;
		Inventory inv;
		System.out.println ("Does he want Widgets or Junk?");
		String which = scan.next();
		if (which.equals("Widgets"))
			inv = i1;
		else
			inv = i2;
		System.out.println("How many does he want to buy?");
		int num = scan.nextInt();
		if (inv.getNumInStock()>num)
		{
			s.setCust(cust);
			s.setInv(inv);
			s.setNumBought(num);
			System.out.println(s.toString());
			// look at this next line carefully
			s.getInv().setNumInStock(s.getInv().getNumInStock() - num);
			s.getInv().profit();
		}
		else
			System.out.println ("There are not that many in stock to sell!");
	}
	
	public static void printInv(Sales s)
	{
		System.out.println(s.getInv().toString());			
	}
			
		
		
	
}
