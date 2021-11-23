//Arrays Copy Arrays 55 pts Happy Kan 
import java.util.Arrays;
import java.util.*;
public class CopyingArrays
{
    public static void main (String[]args)
    {
        Random r = new Random ();
        int arr[] = new int[10];
        int arr1[] = new int[10];
        System.out.print("Array 1: ");
        for (int a=0; a<arr.length; a++)
        {
            arr[a] = 1+r.nextInt(100);
            arr[9] = -7;
            System.out.print(arr[a]+" ");
        }
        System.out.println();
        arr1 = arr;

        System.out.print("Array 2: ");
        for (int b=0; b<arr1.length; b++)
        {
            arr[9] = 1+r.nextInt(100);
            System.out.print(arr1[b]+" ");
        }
    }
}