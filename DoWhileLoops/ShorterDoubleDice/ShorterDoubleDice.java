//Do While Loops Shorter Double Dice 40 pts Happy Kan
import java.util.Random;
public class ShorterDoubleDice
{
    public static void main ( String[]args )
    {
        Random r = new Random();
        System.out.println( "HERE COMES THE DICE!" );
        System.out.println();
        int first_try = 0;
        int second_try = 0;
        first_try = 1+r.nextInt(6);
        second_try = 1+r.nextInt(6);

        do
        {
            System.out.println( "Roll #1: " + first_try );
            System.out.println( "Roll #2: " + second_try );
            int sum = first_try + second_try;
            System.out.println( "The total is " + sum + " !" );
            System.out.println();
            int third_try = 1+r.nextInt(6);
            int forth_try = 1+r.nextInt(6);
            first_try=third_try;
            second_try=forth_try;
        }
        while ( first_try != second_try );
        System.out.println();
        System.out.println( "Roll #1: " + first_try );
        System.out.println( "Roll #2: " + second_try );
        System.out.println( "The total is " + (first_try + second_try) + "!" );
    }
    
}