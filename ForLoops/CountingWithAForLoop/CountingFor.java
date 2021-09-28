//For Loops Counting with a For Loop 10 pts Happy Kan
import java.util.Scanner;
public class CountingFor
{
    public static void main(String[]args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println( "Type in a message, and I'll display it five times." );
        System.out.print( "Message: " );
        String message = keyboard.nextLine();

        for ( int n=2; n<=10; n=n+2 )
        {
            System.out.println( n + ". " + message );
        }
    }
}
//1. n=n+1 makes the n plus one each time and continues with the new n
//2. it start by n=1
//3. 