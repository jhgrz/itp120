package itp120mod4.Ex1.methodsFromJavaAPIs;

public class MoreStrings {

	
	public static void main(String[] args) {
		
		String s = new String("I love Java and Java loves me!!");
		
		// I want to know what the last character in the string is.
		char last = lastChar(s);
		System.out.println ("The last character in the string is " + last);
		
		
		int num = numO(s);
		System.out.println("The number of 'O' characters in the string is " + num);
		

	}
	
	public static int numO(String s) {
		int numberO = 0;
		for (int i=0;i<s.length();i++)
			if (s.charAt(i) == 'O' || s.charAt(i)=='o')
				numberO++;
		return numberO;
		
		
	}

	public static char lastChar(String str){
		int size = str.length();
		char lastOne = str.charAt(size-1);
		return lastOne;		
	}
	
	
	
	

}
