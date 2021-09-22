//While Loop Enter Your PIN 15 pts Happy Kan
import java.util.Scanner;
public class EnterPIN
{
    public static void main( String[]args )
    {
        Scanner keyboard = new Scanner(System.in);
        int pin = 12345;

        System.out.println( "WELCOME TO THE BANK OF MITCHELL." );
        System.out.print( "ENTER YOUR PIN: " );
        int entry = keyboard.nextInt();

        while ( entry != pin )
        {
            System.out.println("\nINCORRECT PIN. TRY AGAIN." );
            System.out.print( "ENTER YOUR PIN: " );
            entry = keyboard.nextInt();
        }

        System.out.println( "\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT." );
    }
}
// 1. Similar to conditional if statements, which are blocks of code that only execute if a specific condition evaluates to true.
// 2. while loop does things as long as the condition is true.
// 3. The entry is already set as int before the while loop
// 4. "Incorrect code" keeps appearing. Because entry != pin. Without the original line, it will run in the loop forever because the condition is true.