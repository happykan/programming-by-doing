//Random Numbers Randomness pts 15 Happy Kan
import java.util.Random;
public class Randomness
{
    public static void main( String[]args )
    {
        Random r = new Random();

        int x = 1 + r.nextInt (10);
        
        System.out.println( "My random number is  " + x );

        System.out.println( "Here are some numbers from 1 to 5?" );
        System.out.print( 3 + r.nextInt(5) + " " );
        System.out.print( 3 + r.nextInt(5) + " " );
        System.out.print( 3 + r.nextInt(5) + " " );
        System.out.print( 3 + r.nextInt(5) + " " );
        System.out.print( 3 + r.nextInt(5) + " " );
        System.out.print( 3 + r.nextInt(5) + " " );
        System.out.println();

        System.out.println( "Here are some numbers from 1 to 100!" );
        System.out.print( 1 + r.nextInt(100) + "\t" );
        System.out.print( 1 + r.nextInt(100) + "\t" );
        System.out.print( 1 + r.nextInt(100) + "\t" );
        System.out.print( 1 + r.nextInt(100) + "\t" );
        System.out.print( 1 + r.nextInt(100) + "\t" );
        System.out.print( 1 + r.nextInt(100) + "\t" );
        System.out.println();

        int num1 = 1 + r.nextInt(10);
        int num2 = 1 + r.nextInt(10);

        if ( num1 == num2 )
        {
            System.out.println( "The random numbers were the same! Weird." );
        }
        if ( num1 != num2 )
        {
            System.out.println( "The reandom numbers were different! Not too surpristin, actually." );
        }
    }
}
// 1. The new range of the randome numbers will be 1-4
// 2. No. The new range will be 1-7
// 3. The answers will be the same. 
// 4. No matter how many times I tried, the results are all the same. Changing the random seed won't impact the result.