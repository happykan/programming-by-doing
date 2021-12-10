//ArrayLists ArrayList - There or Not? 85 pts Happy Kan
import java.util.*;
public class ArrayListThereOrNot
{
    public static void main (String[]args)
    {
        Random r = new Random();
        Scanner input = new Scanner (System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i=0; i<10; i++)
        {
            list.add(1+r.nextInt(51));
        }
        System.out.print("ArrayList: " + list);
        System.out.println();
        System.out.print("Value to find: ");
        int x = input.nextInt();
        
        if (list.contains(x))
        {
            System.out.println(x + " is in the ArrayList.");
        }
        else
        {
            System.out.println(x + " is not in the ArrayList.");
        }
    }
}