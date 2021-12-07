//ArrayLists Basic ArrayLists 2 40 pts Happy Kan
import java.util.*;
@SuppressWarnings("unchecked")
public class BasicArrayLists2
{
    public static void main (String[]args)
    {
        Random r = new Random();
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i=0; i<10; i++)
        {
            list.add(getNumbers());
        }
        System.out.print("ArrayList: " + list);
    }
    public static int getNumbers()
    {
        Random r = new Random();
        int x = 1+r.nextInt();
        return x;
    }
}