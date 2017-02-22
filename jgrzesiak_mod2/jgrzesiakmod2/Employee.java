package jgrzesiakmod2;

public class Employee {
	
	private String name;
	private int idNumber;
	private String department;
	private String position;
	
	public Employee (String n, int i, String d, String p)
	{
		name = n;
		idNumber = i;
		department = d;
		position = p;
	}
	
	public Employee (String n, int i)
	{
		name = n;
		idNumber = i;
		department = "";
		position = "";
	}
		
	public Employee ()
	{
	}

	public String toString()
	{
		return name + ", ID Number " + idNumber + ", works in the " + department 
				+ " department as a " + position + ".";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	
	
}
