//Arrays Locating the Largest Value in an Array 110 pts Happy Kan
import java.util.*;
public class LocatingLargest
{
    public static void main (String[]args)
    {
        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();
        int temp;
        int a[] = new int [10];
        System.out.print("Aray: ");
        for (int i=0; i<a.length; i++)
        {
            a[i]=r.nextInt(100);
            System.out.print(a[i]+" ");
        }
        for (int i=0; i<a.length; i++)
        {
            for(int j = i+1; j<a.length; j++)
            {
                if(a[i]>a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("The larges value is: " + a[a.length-1]);
        
    }
}