package itp120mod2ANSWERS17_18;

import java.util.Scanner;
import java.text.NumberFormat;
public class BMIWrongWHY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		
		
		System.out.println("Welcome to the body mass index (BMI) calulator." );
		
		System.out.println("Enter your weight in pounds: "  );
		double pounds = scan.nextDouble();
		
		System.out.println("Enter your height in inches?: " );
		double inches = scan.nextDouble();
 
		double bmi = (pounds / (inches * inches)) * 703;
		NumberFormat nf = NumberFormat.getInstance();
		System.out.println("Your BMI is: " + nf.format(bmi));
		
		//115 lbs and 66 inches  
		if (bmi < 18.5)
			System.out.println("You are underweight\n");
		else if (bmi > 18.6 && bmi < 24.9)
			System.out.println("You are just right\n");
		else if (bmi > 25 && bmi < 29.9)
			System.out.println("You are slightly overweight\n");
		else 
			System.out.println("Please work on your weight - this is not good for your health\n");
		
		
		
		
		System.out.println("  Accepted ranges:");
		System.out.println("BMI VALUES");
		System.out.println("Underweight: less than 18.5");
		System.out.println("Normal:      between 18.5 and 24.9");
		System.out.println("Overweight:  between 25 and 29.9");
		System.out.println("Obese:       30 or greater");
			
		
	}
	

}
