//File Input and Output Summing Three Numbers from Any File 65 pts Happy Kan
import java.io.*;
import java.util.Scanner;
public class SummingThreeNumbersFromAnyFile
{
    public static void main(String[]args) throws IOException
    {
        System.out.print("Which file would you like to read numbers from 3num1, 2, or 3.txt: ");
        Scanner keyboard = new Scanner(System.in);
        String file = keyboard.next();
        if (file.equals("3nums1.txt"))
        {
            Scanner FileIn = new Scanner(new File("3nums1.txt"));
            String num_1 = FileIn.next();
            String num_2 = FileIn.next();
            String num_3 = FileIn.next();
            System.out.println("Reading numbers from file \"3nums1.txt\"");
            System.out.println();
            Integer a = Integer.parseInt(num_1);
            Integer b = Integer.parseInt(num_2);
            Integer c = Integer.parseInt(num_3);
            System.out.println(num_1 + "+" + num_2 + "+" + num_3 + "=" + (a+b+c));
        }
        else if (file.equals("3nums2.txt"))
        {
            Scanner FileIn = new Scanner(new File("3nums2.txt"));
            String num_1 = FileIn.next();
            String num_2 = FileIn.next();
            String num_3 = FileIn.next();
            System.out.println("Reading numbers from file \"3nums2.txt\"");
            System.out.println();
            Integer a = Integer.parseInt(num_1);
            Integer b = Integer.parseInt(num_2);
            Integer c = Integer.parseInt(num_3);
            System.out.println(num_1 + "+" + num_2 + "+" + num_3 + "=" + (a+b+c));
        }
        else if (file.equals("3nums3.txt"))
        {
            Scanner FileIn = new Scanner(new File("3nums3.txt"));
            String num_1 = FileIn.next();
            String num_2 = FileIn.next();
            String num_3 = FileIn.next();
            System.out.println("Reading numbers from file \"3nums3.txt\"");
            System.out.println();
            Integer a = Integer.parseInt(num_1);
            Integer b = Integer.parseInt(num_2);
            Integer c = Integer.parseInt(num_3);
            System.out.println(num_1 + "+" + num_2 + "+" + num_3 + "=" + (a+b+c));
        }

    }
}