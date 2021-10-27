//File Input and Output Summing Three Numbers from a File 50 pts Happy Kan
import java.io.*;
import java.util.Scanner;
public class SummingThreeNumbersFromAFile
{
    public static void main(String[]args) throws IOException
    {
        Scanner FileIn = new Scanner(new File("3nums.txt"));
        String num_1 = FileIn.next();
        String num_2 = FileIn.next();
        String num_3 = FileIn.next();
        System.out.println("Reading numbers from file \"3nums.txt\" ... done.");
        System.out.println();
        Integer a = Integer.parseInt(num_1);
        Integer b = Integer.parseInt(num_2);
        Integer c = Integer.parseInt(num_3);
        System.out.println(num_1 + "+" + num_2 + "+" + num_3 + "=" + (a+b+c));
    }
}