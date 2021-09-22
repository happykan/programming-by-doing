//While Loops Counting With A While Loop 30 pts Happy kan
import java.util.Scanner;
public class CountingWhile
{
    public static void main( String[]args )
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println( "Type in a message, and I'll display it several times." );
        System.out.print( "Message: " );
        String message = keyboard.nextLine();
        System.out.println( "How many times? " );
        int number = keyboard.nextInt();

        int n = 0;
        while (n<number)
        {
            System.out.println( (n+10) + ". " + message );
            n++;
        }
    }
}
// 1. the output goes on forever
// 2. 