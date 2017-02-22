package jgrzesiakmod2;


import java.util.*;
public class AccountDriver {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Let's create an Account object.  Assume we do not know the data
		Account acct = new Account();
		
		// now let's create one with known data.
		// Look at the full constructor in the Account class.
		// The signature is    public Account (int a, double b, String l, String f)
		// This requires parameters of int,double String, String IN THAT ORDER!!!
		Account acct2 = new Account(120, 15000, "Jones", "Sam");
		
		// the above example assumes this data is known.  You may need to 
		// get it from the Keyboard.  Note that the temporary variables that
		// you create to store values until you make the object, may or may
		// not have the same name as the actual field - it does not matter.
		// Usually they do not match since two different developers are 
		// writing the classes
		
		System.out.println("Account number: "); int num = scan.nextInt();
		System.out.println("Balance: "); double bal = scan.nextDouble();
		scan.nextLine();
		System.out.println("Last: "); String last = scan.nextLine();
		System.out.println("First: "); String first = scan.nextLine();
		Account acct3 = new Account(num, bal, last, first);
		
		// now call some of the methods
		acct3.deposit(1000);
		acct2.withdraw(200,1.50);
		acct3.deposit(30);
		
		acct.setAcctNum(300);
		acct.setBalance(34.00);
		acct.setFirst("Sally");
		acct.setLast("Peerson");
		
		// now print out the objects (the toString method will be used for this)
		print(acct);
		print(acct2);
		print(acct3);
	}
	
	
	public static void print(Account a)
	{
		System.out.println(a.toString());
	}
}
