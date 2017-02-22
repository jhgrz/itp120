package itp120mod4.Ex1.methodsFromJavaAPIs;

public class Ex1String {

	
	public static void main(String[] args) {
		
		// The String class is a class defined by Java and found in the java.lang package
		// You create strings by using the constructor.
		// You then use the methods below to manipulate the string.
		
		String name = "Diane";	
		
		//String name = new String ("Diane");
		
		// String (String str)
		// Constructor: creates a new string object with the same characters as str
		String myString = new String("I am having fun!");
		System.out.println(myString);
		
		
		
		// char     charAt( int index)
		// Returns the character at the specified location
		
		//  optional left side if it returns a value = object.method(any parameters needed)
		char three = myString.charAt(3);
		System.out.println(three);
		
		// String concat (String str)
		// Returns a new string consisting of this string concatenated with str
		String newString = myString.concat(" Are you?");
		System.out.println(newString);
		
		
		
		// boolean equalsIgnoreCase (String str)
		// Returns true if this string contains the same characters as str (without
		// regards to case) and false otherwise
		String myName = "Diane";
		String other = "diane";
		boolean same = myName.equalsIgnoreCase(other);
		System.out.println(same);
		
		
		
		
		//int length()
		// Returns the number of characters in this string)
		System.out.println("The length of myString is " + myString.length());
		
		
		// String substring (int offset, int endIndex)
		// Returns a new string that is a subset of this string starting at index offset
		// and extending through endIndex - 1
		String sub = myString.substring(3,8);
		System.out.println(sub);
		
		
		
		String phrase = new String("Change is inevitable");
		// this is how we ALWAYS create objects
		// ClassName objectName = new ClassName(optional set of paramters)
		// the only exception is that Java let's us use a shortcut for Strings only
			
		System.out.println(phrase);
		
		// now let's look at some methods.  To call a nonstatic method on an object, you type object.method()
		//  We will use the length() method.  
		// Look at the API for the length() method.
		// It shows nothing in the parentheses (the parameters that you need to match with your arguments)
		//and returns an integer value
		int howLong = phrase.length();
		System.out.println("The length is " + howLong);
		
		// I want to convert the phrase to all upper class.  From the APIs, I know it
		// returns a String, so I stored the value in a String variable.		
		String upperString = phrase.toUpperCase();
		System.out.println(upperString);
		
		
		// I want to create a new String that has all of the e's replaced with z's.  
		// From the APIs,  I need two things in parantheses (called arguments) which are the old and new character.
		// Characters are ALWAYS in single quotations and Strings are ALWAYS in double quotes.
		String newString2 = phrase.replace('e', 'z');
		System.out.println(newString2);
		
		 
		
		
		

	}

}
