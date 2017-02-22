package jgrzesiakmod2;
import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	double height;
	double weight;
	double bmi;
	
	//Program Welcome
	System.out.println("Welcome to the Body Mass Index Calculator (BMI)");
	
	//inputs
	System.out.println("Please Enter Your Height (in inches):");
		height = scan.nextInt();
		
	System.out.println("Please Enter Your Weight (in pounds):");
		weight = scan.nextInt();
		
	
	//Calculate BMI	
	bmi = ((weight / (height * height))*703);
	
	//Display BMI
	System.out.printf("Your BMI is : %.2f%n", bmi);
	
	//Decide Category Message
	if (bmi <= 18.5)
		System.out.printf("You are Underweight, please eat more");
		
	else if (bmi >= 18.6 && bmi <= 24.9)
		System.out.printf("You are Normal, keep it up");
	
	else if (bmi >= 25 && bmi <= 29.9)
		System.out.printf("You are Overweight, review habits", bmi);
	
	else if (bmi > 30)
		System.out.printf("You are Obese, please look into this", bmi);
	
	//Display BMI Categories
	System.out.printf("%n%n  Accepted Ranges %nBMI Values %n" + "Underweight: less than 18.5 %n" 
					+ "Normal: between 18.5 and 24.9 %n" + "Overweight: between 25 and 29.9 %n"
					+ "Obese: 30 or greater");
	}

}
