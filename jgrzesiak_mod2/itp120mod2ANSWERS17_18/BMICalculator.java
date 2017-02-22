package itp120mod2ANSWERS17_18;
import java.text.DecimalFormat;
// Exercise 2.33 Solution: BMICalculator.java
// Calculate and display the user's body mass index.
import java.util.Scanner;

public class BMICalculator 
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      DecimalFormat df = new DecimalFormat("##.0");
      int weight; // weight in pounds
      int height; // height in inches
      int bmi; // user's body mass index

      // obtain weight in pounds and height in inches
      System.out.println("Welcome to the body mass index (BMI) calculator");
      System.out.print("Enter your weight in pounds: ");
      weight = input.nextInt();
      System.out.print("Enter your height in inches: ");
      height = input.nextInt();

      // calculate BMI
      bmi = (weight * 703) / (height * height);

      // display results
      System.out.println("Your BMI is: " + df.format(bmi));
      
      
      if (bmi<18.5)
    	  System.out.println("You are underweight -- eat some food!");
      else if (bmi < 25)
    	  System.out.println ("You are just right");
      else if (bmi <30)
    	  System.out.println("You are a little overweight - get some more exercise");
      else
    	  System.out.println("Please work on your weight - this is not good for your health");
   
      System.out.println("\n Accepted ranges:");
      System.out.println("BMI VALUES");
      System.out.println("Underweight: less than 18.5");
      System.out.println("Normal:      between 18.5 and 24.9");
      System.out.println("Overweight:  between 25 and 29.9");
      System.out.println("Obese:       30 or greater");
   } // end main 
} // end class BMICalculator


