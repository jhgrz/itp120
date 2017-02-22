package jgrzesiakmod2;

public class Bird {
	
	// your instance variables (fields)
	//private datatype variableName
	//private means only this class can use this
	
	private String name;
	private String breed;
	private int age;
	//etc.
	
	// constructors - used to make objects from the blueprint
	// they have the same name as the class
	//they really are methods (not verbs) - exception to the rule
	
	// no argument constructors
	public Bird ()
	{
		
	}
	
	// full constructor
	public Bird(String n, String b, int a)
	{
		name = n;
		breed = b;
		age = a;
	}
	
	//often we write more than one constructor.  This next one is for birds where I know only their name
	//when I create them.  I can use the setter to set the values for the other fields later (see the driver)
	public Bird (String n) {
		name = n;
		breed = "";
		
	}
	
	// we write a toString method that indicates how we want the object written
	// to the console
	
	public String toString()
	{
		return name + " is a " + breed + " who is " + age + " years old";
	}
	
	// other methods go here
	// mostly in module 3
	
	// getters and setters
	// getters retrieve the value of an instance variable
	//setters are used to set or change the value of an instance variable
	// typically write one each for each field

	public String getName() {
		return name;
	}

	public void setName(String n) {
		name = n;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	

}
