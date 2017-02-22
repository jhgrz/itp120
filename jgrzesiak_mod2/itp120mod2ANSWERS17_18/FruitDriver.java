package itp120mod2ANSWERS17_18;

public class FruitDriver {

	public static void main(String[] args) {
		Fruit b = new  Fruit("banana", 94,0.20,0.50);
		Fruit a = new Fruit("apple",52,0.10,0.45);
		Fruit or = new Fruit("orange",86,0.20,0.55);
		
		System.out.println(a.toString());
		System.out.println(or.toString());
		
		double bCPG = b.costPerKg();
		double aCPG = a.costPerKg();
		double orCPG = or.costPerKg();
		
		
		if(bCPG<aCPG && bCPG <orCPG){
			System.out.println("A banana has the lowest cost per kg");
		}
		else if(aCPG<bCPG && aCPG <orCPG){
			System.out.println("A apple has the lowest cost per kg");
		}
		else if(orCPG<aCPG && orCPG <bCPG){
			System.out.println("A orange has the lowest cost per kg");
		}
		else
			System.out.println ("At least two of them have the same cost per kg");
	}

}
