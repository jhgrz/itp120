package deitelfig16_14;
// Fig. 16.14: StringBuilderInsertDelete.java
// StringBuilder methods insert, delete and deleteCharAt.

public class StringBuilderInsertDelete 
{
   public static void main( String[] args )
   {
      Object objectRef = "hello";  
      String string = "goodbye";  
      char[] charArray = { 'a', 'b', 'c', 'd', 'e', 'f' };
      boolean booleanValue = true;
      char characterValue = 'K';
      int integerValue = 7;
      long longValue = 10000000;
      float floatValue = 2.5f; // f suffix indicates that 2.5 is a float
      double doubleValue = 33.333;

      StringBuilder buffer = new StringBuilder();

      buffer.insert( 0, objectRef );
      buffer.insert( 0, "  " ); // each of these contains new line
      buffer.insert( 0, string );
      buffer.insert( 0, "  " );
      buffer.insert( 0, charArray );
      buffer.insert( 0, "  " );
      buffer.insert( 0, charArray, 3, 3 );
      buffer.insert( 0, "  " );
      buffer.insert( 0, booleanValue );
      buffer.insert( 0, "  " );
      buffer.insert( 0, characterValue );
      buffer.insert( 0, "  " );
      buffer.insert( 0, integerValue );
      buffer.insert( 0, "  " );
      buffer.insert( 0, longValue );
      buffer.insert( 0, "  " );
      buffer.insert( 0, floatValue );
      buffer.insert( 0, "  " );
      buffer.insert( 0, doubleValue );

      System.out.printf( 
         "buffer after inserts:\n%s\n\n", buffer.toString() );

      buffer.deleteCharAt( 10 ); // delete 5 in 2.5
      buffer.delete( 2, 6 ); // delete .333 in 33.333

      System.out.printf( 
         "buffer after deletes:\n%s\n", buffer.toString() );
   } // end main
} // end class StringBuilderInsertDelete

/**************************************************************************
 * (C) Copyright 1992-2012 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
