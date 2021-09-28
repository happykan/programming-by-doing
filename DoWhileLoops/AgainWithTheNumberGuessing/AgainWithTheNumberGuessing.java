//Do While Loops Again with the Number-Guessing 35 pts Happy Kan
import java.util.Random;
import java.util.Scanner;
public class AgainWithTheNumberGuessing
{
    public static void main( String[]args )
    {
        Random r = new Random ();
        Scanner keyboard = new Scanner(System.in);
        int x = 1 + r.nextInt(10);

        System.out.println( "I have chosen a number between 1 and 10. Try to guess it." );
        System.out.print( "Your guess: " );
        int ans = keyboard.nextInt();
        int tries = 1;
        do
        {
            System.out.println( "That is incorrect. Guess again." );
            System.out.print( "Your guess: " );
            ans = keyboard.nextInt();
            tries++;
        }
        while ( x != ans );
        System.out.println( "That's right! You're a good guesser." );
        System.out.println( "It only took you " + tries + " tries." );
    }
}