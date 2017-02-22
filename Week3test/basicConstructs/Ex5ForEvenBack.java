package basicConstructs;

public class Ex5ForEvenBack {

	// print out the even numbers between 100 and 200
	public static void main(String[] args) {
		
		for (int number=100; number<=200; number = number +2)
			System.out.println(number);
		
		// count backwards from 100 to 0 divisible by 5
		for (int number=100; number >=0; number = number - 5)
			System.out.println(number);
		

	}

}
