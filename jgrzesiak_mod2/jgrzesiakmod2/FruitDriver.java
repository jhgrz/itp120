package jgrzesiakmod2;

public class FruitDriver {

	public static void main(String[] args) {
	Fruit b = new Fruit("banana", 94, 0.20, 0.50);
		b.calPerKg();
		b.costPerKg();
	Fruit a = new Fruit("apple", 52, 0.10, 0.45);
		a.calPerKg();
		a.costPerKg();
	Fruit or = new Fruit("orange", 86, 0.20, 0.55);
		or.calPerKg();
		or.costPerKg();
	
	//Display all Objects
	System.out.println(b.toString());
	System.out.println(a.toString());
	System.out.println(or.toString());
	
	//Decision to display the least coper per kg object
	if (a.costPerKg < b.costPerKg && a.costPerKg < or.costPerKg)
		System.out.printf("A %s has the lowest cost per kg", a.getType());
	else if (b.costPerKg < a.costPerKg && b.costPerKg < or.costPerKg)
		System.out.printf("A %s has the lowest cost per kg", b.getType());
	else
		System.out.printf("A %s has the lowest cost per kg", or.getType());
	}
	
}
