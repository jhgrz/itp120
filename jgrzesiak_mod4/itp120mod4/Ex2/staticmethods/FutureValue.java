package itp120mod4.Ex2.staticmethods;

import java.text.NumberFormat;
import java.util.Scanner;

public class FutureValue {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Investment amt:");
		double invAmt = scan.nextDouble();
		System.out.println("How many years?");
		double numYears = scan.nextDouble();
		System.out.println("What is the yearly interest rate?");
		double yrRate = scan.nextDouble();
		
		calcFutureValue(invAmt, numYears, yrRate);

	}
	
	public static void calcFutureValue(double amt, double yrs, double rate){
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		double future = amt * Math.pow(1+((rate/100)/12), yrs*12);
		System.out.println("the future value is " + nf.format(future));
	}
	

}
