package basicConstructs;

public class RetailItemDriver {

	public static void main(String[] args) {
		RetailItem id001 = new RetailItem("Jacket",12,59.95);
		RetailItem id002 = new RetailItem("Designer Jeans",40,34.95);
		RetailItem id003 = new RetailItem("Shirt",20,24.95);
		
		System.out.println(id001.toString());
		System.out.println(id002.toString());
		System.out.println(id003.toString());
		

	}

}
