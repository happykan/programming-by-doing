//While Loops PIN Lockout 10 pts Happy Kan
import java.util.Scanner;
public class PinLockout
{
    public static void main( String[]args )
    {
        Scanner keyboard = new Scanner(System.in);
        int pin = 12345;
        int tries = 0;
        int MaxTries = 4;

        System.out.println( "WELCOME TO THE BANK OF MITCHELL." );
        System.out.print( "ENTER YOUR PIN: " );
        int entry = keyboard.nextInt();
        tries++;

        while ( entry != pin && tries < MaxTries )
        {
            System.out.println( "\nINCORRECT PIN. TRY AGAIN." );
            System.out.print( "ENTER YOUR PIN: " );
            entry = keyboard.nextInt();
            tries++;
        }
        if ( entry == pin )
        {
            System.out.println( "\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT." );
        }
        else if ( tries >= MaxTries )
        {
            System.out.println( "\nYOU HAVE RUN OUT OF TRIES. ACCOUNT LOCKED." );
        }
    }
}