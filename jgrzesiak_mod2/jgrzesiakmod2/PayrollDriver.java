package jgrzesiakmod2;

public class PayrollDriver {

	public static void main(String[] args) {

		Payroll bugs = new Payroll("Bugs Bunny", "01B", 48.00, 40.00);
		bugs.grossPay();
		
		Payroll fud = new Payroll ();
		fud.setName("Elmer Fudd");
		fud.setId("02G");
		fud.setNhour(60.00);
		fud.setPhour(38);
		fud.grossPay();
		
		System.out.println(bugs.toString());
		
		System.out.println(fud.toString());
		
		

	}

}
