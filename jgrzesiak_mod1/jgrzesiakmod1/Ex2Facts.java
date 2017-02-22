package jgrzesiakmod1;


public class Ex2Facts
{
   //-----------------------------------------------------------------
   //  Prints various facts.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      // Strings can be concatenated into one long string
      System.out.println ("We present the following facts for your "
                          + "fun and enjoyment:");

      //NOTE: this is one of the ways to skip a line in the output
      //but we are not really concerned with "pretty" output
      System.out.println ();

      // A string can contain numeric digits but they are just considered text
      System.out.println ("Number of eggs in a dozen: 12");

      // A numeric value can be concatenated to a string
      // NOTE the space after Antarctica: and the double quote.  
      // this will leave a space before the number.  
      // The only place that Java is white space sensitive is inside quotes
      System.out.println ("Dialing code for Antarctica: " + 672);

      System.out.println ("Year in which Leonardo da Vinci invented "
                          + "the parachute: " + 1515);

      System.out.println ("Speed of ketchup: " + 40 + " km per year");
   }
}
