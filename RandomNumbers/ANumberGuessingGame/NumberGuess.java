//Random Numbers A Number-Guessing Game 20 pts Happy Kan
import java.util.Random;
import java.util.Scanner;

public class NumberGuess
{
    public static void main( String[]args )
    {
        Random r = new Random ();
        Scanner keyboard = new Scanner(System.in);
        int x = 1 + r.nextInt(10);

        System.out.println( "I'm thinking of a number from 1 to 10.");
        System.out.println( "Your guess: " );
        int ans = keyboard.nextInt();

        if ( x == ans )
        {
            System.out.println( "That's right! My secret number is " + ans + "!" );
        }
        else if ( x != ans )
        {
            System.out.println( "Sorry. My secret number is " + x + "." );
        }

        
    }
}