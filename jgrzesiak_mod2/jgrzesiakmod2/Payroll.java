package jgrzesiakmod2;

import java.text.NumberFormat;

public class Payroll {
	NumberFormat money = NumberFormat.getCurrencyInstance();
	private String name = "";
	private String id = "";
	private double phour;
	private double nhour;
	private double gross;
	
	//No Argument Const
	public Payroll ()
	{
	}
	
	//Full Const
	public Payroll (String n, String i, double p, double nh)
	{
		name = n;
		id = i;
		phour =p;
		nhour = nh;
	}
	
	//Gross Pay Method
	public void grossPay ()
	{
		gross = phour * nhour;
	}
	
	public String toString()
	{
		return name + " with an id of " + id + " worked " + nhour 
				+ " at an \nhourly rate of " + phour + 
				" and a gross pay of " + money.format(gross) + "\nGross Pay = " + money.format(gross);
	}

	//Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getPhour() {
		return phour;
	}

	public void setPhour(double phour) {
		this.phour = phour;
	}

	public double getNhour() {
		return nhour;
	}

	public void setNhour(double nhour) {
		this.nhour = nhour;
	}

	public double getGross() {
		return gross;
	}

	public void setGross(double gross) {
		this.gross = gross;
	}
	
	
}
