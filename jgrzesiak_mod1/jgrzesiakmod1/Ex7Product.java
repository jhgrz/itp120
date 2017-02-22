package jgrzesiakmod1;

// Calculate the product of three integers.
import java.util.Scanner; // program uses Scanner

public class Ex7Product 
{
   public static void main( String[] args )
   {
      // create Scanner to obtain input from command window
      Scanner input = new Scanner( System.in );

      //Note how we use variable names that have meaning
      int first; // first number input by user
      int second; // second number input by user
      int third; // third number input by user
      int result; // product of numbers

      System.out.print( "Enter first integer: " ); // prompt for input
      first = input.nextInt(); // read first integer

      System.out.print( "Enter second integer: " ); // prompt for input
      second = input.nextInt(); // read second integer
      
      System.out.print( "Enter third integer: " ); // prompt for input
      third = input.nextInt(); // read third integer

      result = first * second * third; // calculate product of numbers

      System.out.println( "Product is " + result );
   } // end method main
} // end class Product


