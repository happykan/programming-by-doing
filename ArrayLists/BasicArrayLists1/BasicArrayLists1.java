//ArrayLists Basic ArrayLists 1 30 pts Happy Kan
import java.util.*;
@SuppressWarnings("unchecked")
public class BasicArrayLists1
{
    public static void main (String[]args)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i=0; i<10; i++)
        {
            list.add(-113);
        }
        for (int i=0; i<list.size(); i++)
        {
            System.out.println("Slot " + i + " contains a " + list.get(i));
        }
    }
}