package jgrzesiakmod2;

public class EmployeeDriver 
{

	public static void main(String[] args) {
	
		Employee emp1 = new Employee ("Mike Miller", 78655, "Accounting", "President");
		Employee emp2 = new Employee ("Sam Jones", 76798, "IT", "Programmer");
		Employee emp3 = new Employee ("Sally Rogers", 98745, "Technical Support",
				"Help Desk Technician");
		
		System.out.println (emp1.toString());
		System.out.println (emp2.toString());
		System.out.println (emp3.toString());
	}

}
