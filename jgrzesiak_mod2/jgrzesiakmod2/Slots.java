package jgrzesiakmod2;


public class Slots {

	public static void main(String[] args) {

	
	int x = (int) (Math.random()*10);
	int y = (int) (Math.random()*10);
	int z = (int) (Math.random()*10);
	
	System.out.printf("Your Randomly Generated Slot Numbers are %s%s%s:  ", x, y, z);
	
	if (x == y && y == z && z==x) 
		System.out.printf("YOU WON IT ALL, ALL y's MATCHED", y);
	
	else if (x == y)
		System.out.printf("Hey two %x's matched, so close!", x);
	
	else if (y == z)
		System.out.printf("Hey two %x's matched, so close!", y);
	
	else if (x == z)
		System.out.printf("Hey two %x's matched, so close!", z);
	
	else 
		System.out.println("NO MATCHES");
		
	}

}
