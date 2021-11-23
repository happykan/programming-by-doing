//Arrays Finding a Value in an Arrar 80 pts Happy Kan
import java.util.*;
public class FindingAValueInAnArray
{
    public static void main (String[]args)
    {
        Random r = new Random();
        Scanner keyboard = new Scanner(System.in);
        int a[] = new int [10];
        System.out.print("Array: ");
        for (int i=0; i<a.length; i++)
        {
            a[i] = r.nextInt(50);
            System.out.print(a[i] + " ");
        }
        System.out.print("Value to find: ");
        int value = keyboard.nextInt();
        System.out.println();
        for (int i=0; i<a.length; i++)
        {
            if (a[i] == value)
            {
                System.out.println(value + "is int the array");
            }
        }
    }
}