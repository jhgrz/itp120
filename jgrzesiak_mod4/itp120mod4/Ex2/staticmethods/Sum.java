package itp120mod4.Ex2.staticmethods;

public class Sum {

	public static void main(String[] args) {
		// this next method call will use the first version of the add() method
		// even though these are integers, Java will use the method whose parameters
		//best match the arguments and Java can cast integers to doubles implicitly
		add(4,5);
		//this next method call will use the second version since it requires three integers
		add(4,5,6);
		//this next method call will use the last version since it has three Strings
		add("Hi","Bye","Later");
		//this next method call will use the first version
		add(4.5,7.6);
		//if you uncomment the next one, you will get an error message since there is no version
		//of the method that matches (or implicitly casts) to two strings
		//add("Hi","Bye");
		

	}
	
	//overloading - multiple versions of a method in the same class
	//must have unique parameter list
	
	public static void add (double first, double second) {
		double ans = first + second;
	}
	
	public static void add (int first, int second, int third){
		int ans = first + second + third;
	}

	public static void add (String first, String second, String third){
		String ans = first + second + third;
	}
}
