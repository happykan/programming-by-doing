//For Loops Counting Machine 20 pts Happy Kan
import java.util.Scanner;
public class CountingMachine
{
    public static void main(String[]args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print( "Count to: " );
        int range = keyboard.nextInt();
        for (int n=0; n<=range; n=n+1)
        {
            System.out.print( n + " " );
        }
    }
}