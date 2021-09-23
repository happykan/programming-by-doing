//While Loops Hi-Lo WithLimited Tries 55 pts Happy Kan
import java.util.Scanner;
import java.util.Random;
public class HiLoLimited
{
    public static void main( String[]args )
    {
        Random r = new Random();
        Scanner keyboard = new Scanner(System.in);
        int x = 1+r.nextInt(100);
        System.out.println( "I'm thinking of a number between 1-100. You have 7 guesses." );
        System.out.print( "First guess: " );
        int guess = keyboard.nextInt();
        int tries = 1;

        while ( x!=guess && tries<=7 )
        {
            if ( guess>x )
            {
                System.out.println( "Sorry, you are too high." ); 
            }
            else if ( guess<x )
            {
                System.out.println( "Sorry, you are too low." );
            }
            tries++;
            System.out.print( "Guess " + tries + ": " );
            guess = keyboard.nextInt();
        }
        System.out.println( "You guessed it! What are the odds?!?" );
    }
}