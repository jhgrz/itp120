
package itp120mod2ANSWERS17_18;


public class BookDriver {

	
	public static void main(String[] args) {
		
		// create first instance using full constructor and print
		Book book1 = new Book("Java is Fun", 200, 55.00, 1234);
		System.out.println(book1.toString());
		
		// create and set variables of second instance using empty constructor and print
		Book book2 = new Book();
		book2.setTitle("Database R Us");
		book2.setNumInStock(50);
		book2.setCost(35.00);
		book2.setStockNum(5555);
		System.out.println(book2.toString());
		
		// Change cost of second instance and reprint 
		book2.setCost(55.00);
		System.out.println(book2.toString());
		// create a book named "Java is Fun" with 200 in stock costing 55.00 each.  The stock number is 1234
		//print out the book using the toString() method
		//create a book calling the empty constructor.
		//set the title to "Databases R Us"
		//set the number in stock to 50
		// set the cost each to $35.00
		// set the stock number to 5555
		//print out the book.
		//change the price to $55.00
		//print out the book
		

	}

}
