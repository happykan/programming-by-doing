//ArrayLists Basic ArrayLists 3 25 pts Happy Kan
import java.util.*;
public class BasicArrayLists3
{
    public static void main (String[]args)
    {
        Random r = new Random();
        ArrayList<Integer> list = new ArrayList<Integer>(1000);

        for (int i=0; i<1000; i++)
        {
            list.add(getNumbers());
        }
        System.out.print(list);
    }
    public static int getNumbers()
    {
        Random r = new Random();
        int x = 1+r.nextInt(80)+10;
        return x;
    }
}