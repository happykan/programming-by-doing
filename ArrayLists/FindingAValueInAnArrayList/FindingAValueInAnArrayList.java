//ArrayLists Finding a Value in an ArrayLists 80 pts Happy Kan
import java.util.*;
public class FindingAValueInAnArrayList
{
    public static void main (String[]args)
    {
        Random r = new Random();
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner input = new Scanner (System.in);
        for (int i=0; i<10; i++)
        {
            list.add(1+r.nextInt(51));
        }
        System.out.print("ArrayList: " + list);
        System.out.println();
        System.out.print("Value to find: ");
        int x = input.nextInt();
        for (Integer i: list)
        {
            if (x==i)
            {
                System.out.println(x + " is in the ArrayList.");
            }
        }
    }
}
