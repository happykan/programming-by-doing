//For Loops Counting Machine Revisited 25 pts Happy Kan
import java.util.Scanner;
public class CountingMachineRevisited
{
    public static void main(String[]args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print( "Count from: " );
        int ans1 = keyboard.nextInt();
        System.out.print( "Count to: " );
        int ans2 = keyboard.nextInt();
        System.out.print( "Count by: " );
        int ans3 = keyboard.nextInt();
        System.out.println();

        for (int n=ans1; n<=ans2; n=n+ans3)
        {
            System.out.println(n);
        }
    }
}