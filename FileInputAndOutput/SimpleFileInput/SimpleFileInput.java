//File Input and Output Simple File Input 40 pts Happy Kan
import java.io.*;
import java.util.Scanner;
public class SimpleFileInput
{
    public static void main(String[]args) throws IOException
    {
        Scanner FileIn = new Scanner(new File("name.txt"));
        String f_name = FileIn.next();
        String l_name = FileIn.next();
        System.out.println("Using my psychic powers, I have determined that you name is " + f_name + l_name + ".");
    }
}