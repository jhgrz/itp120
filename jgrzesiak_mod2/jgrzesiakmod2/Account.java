package jgrzesiakmod2;


// the next statement(s) in a Java program are import statements if needed
// Java automatically imports the java.lang package
// you must write import statements for any others
import java.text.NumberFormat;

// NOTE:  package and import statements are the ONLY ONES
// allowed in Java outside of the class structure


// remember - classes have only fields (or instance variables) and methods.
public class Account {

	// usually we list the fields (attributes) first
	// the first item when listing fields is their access modifier
	// this indicates who can access this information
	// FIELDS SHOULD BE PRIVATE UNLESS THERE IS A REASON TO DO OTHERWISE
	// private means that no classes except this one can access these directly
	// so-- declare them as      private  dataType    fieldName
	
	private int acctNum;
	private double balance;
	private String last;     // this is not the best way to do this but for simplicity we will 
	private String first;	 // will show you a better way later
	
	
	// next we create some very special methods.  They are called constructors.  They are the
	// ones that construct objects from this blueprint. Production classes may have multiple
	// ways to create objects from the class so will have multiple constructors.
	// We will create two.  Access modifier should be public that means any class can use these
	// to create objects from this blueprint
	
	// the no argument constructor (creates the object but the fields do not yet have values assigned to them
	// create as                    public ClassName () {  }
	
	public Account()
	{
		
	}
	
	// next we need a full constructor (all fields have values assigned to them)
	// study this template carefully!!  It really does not matter the names of the things
	// in parentheses (called parameters) since they are only used locally here.  
	// Often I just use the first letter of the field name.  But the datatypes are critical.
	// They must match the ones from the fields.  Since we have fields that are int, double, String, String
	// our parameters have this order of datatypes.
	// The body of the method just assigns the field a value of the appropriate parameter
	
	public Account (int a, double b, String l, String f)
	{
		acctNum = a;
		balance = b;
		last = l;
		first = f;
	}
	
	// next we need a toString method.  This is our decision on how to write out an object.  
	//If I ask you how to print out the number 25, you can do it.  If I ask you to print out 
	// any primitive type, you know how to do it.  But if I ask you how to print out an Account object
	// there is no standard way.  So you need to define this.
	
	public String toString()
	{
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		return first + " " + last + " has an account number of " + acctNum + " and a balance of " + nf.format(balance);
	}
	
	// then we add any additional methods needed for the class.  I will take a few from your text p 178-179
	// However, your textbook does not do the best job of writing these. These should return a void and not a double
	// if you wanted the value back, you would use the getter method for the object.
	
	// the deposit method - takes in a parameter of an amount
	// and returns nothing (void).  
	//  note that balance is not declared as a local variable because it is a field
	// so this method also sets the value of the balance field.
	public void deposit(double amount)
	{
		balance = balance + amount;
				
	}
	
	// the withdraw method - takes in parameters of amount and the fee.
	// It also resets the field balance to this new value
	// don't let them withdraw more than they have!!!
	public void withdraw (double amount, double fee)
	{
		if (amount < balance)
			balance = balance - amount - fee;
		else
			System.out.println("You do not have that much in your account. ");	
		
	}
	

	// each field needs a getter and a setter.  A getter is a method used to retrieve the value of
		// the field and a setter is a method used to set or change the value of a field.  
		// These are so common in Java, Eclipse will generate them for you!!
		// In general, you need one of each for each field so you need eight total methods for our class
		// To get Eclipse to generate them, look at the outline view (to the right of
		// this editor and right-click on one of the fields listed there.
		// Choose source then generate getters and setters (see lab instructions for a picture of this)
		// In the generate getters and setters window, check all eight and hit ok.
		// you get the methods below:

	public int getAcctNum() {
		return acctNum;
	}

	public void setAcctNum(int acctNum) {
		this.acctNum = acctNum;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getLast() {
		return last;
	}

	public void setLast(String last) {
		this.last = last;
	}

	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}
	
	

	

	
	
	
}
