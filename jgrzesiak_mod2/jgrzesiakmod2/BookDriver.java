package jgrzesiakmod2;


public class BookDriver {

	
	public static void main(String[] args) {
		
		// create a book named "Java is Fun" with 200 in stock costing 55.00 each.  The stock number is 1234
		Book bJava = new Book("Java is Fun", 200, 55.00, 1234);
		//print out the book using the toString() method
		System.out.println(bJava.toString());
		//create a book calling the empty constructor.
		Book bData = new Book();
		//set the title to "Databases R Us"
		bData.setTitle("Databases R Us");
		//set the number in stock to 50
		bData.setNumInStock(50);
		// set the cost each to $35.00
		bData.setCost(35.00);
		// set the stock number to 5555
		bData.setStockNum(5555);
		//print out the book.
		System.out.println(bData.toString());
		//change the price to $55.00
		bData.setCost(55.00);
		//print out the book
		System.out.println(bData.toString());
		
			

	}

}
