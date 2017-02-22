
package itp120mod2ANSWERS17_18;

import java.text.NumberFormat;

public class PayrollDriver
{
	public static void main (String argv[])
	{
		// create new Payroll object employee1 with full constructor
		Payroll employee1 = new Payroll("Donald Duck", 34567, 23.00, 40 );
		
		// create new Payroll object employee2 with empty constructor
		// then set with class setters
		Payroll employee2 = new Payroll();
		employee2.setName("Mickey Mouse");
		employee2.setIdNumber(12345);
		employee2.setHourlyPayRate(32.00);
		employee2.setHoursWorked(35);
		
		// initialize NumberFormat to print out pay
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		
		// print out the two employees info then their Gross Pay
		System.out.println(employee1.toString());
		System.out.println("Gross Pay = " + nf.format(employee1.grossPay()));
		System.out.println(employee2.toString());
		System.out.println("Gross Pay = " + nf.format(employee2.grossPay()));
		
		
		
	}
}