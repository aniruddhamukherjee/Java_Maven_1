package misc;public class GenericMaxTest
{
   // determines the largest of three Comparable objects
   public static <A extends Comparable<A>> A maximum(A x, A y, A z)
   {                      
      A max = x; // assume x is initially the largest       
      if ( y.compareTo( max ) > 0 ){
         max = y; // y is the largest so far
      }
      if ( z.compareTo( max ) > 0 ){
         max = z; // z is the largest now                 
      }
      return max; // returns the largest object   
   }
   public static void main( String args[] )
   {
      System.out.printf( "Max of %d, %d and %d is %d\n\n", 
                   3, 4, 5, maximum( 3, 4, 5 ) );

      System.out.printf( "Maxm of %.1f,%.1f and %.1f is %.1f\n\n",
                   6.6, 8.8, 7.7, maximum( 6.6, 8.8, 7.7 ) );

      System.out.println( "Max of ,pear ,apple, orange "+ maximum( "pear", "apple", "orange" ) );
   }
}