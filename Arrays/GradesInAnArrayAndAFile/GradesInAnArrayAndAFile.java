//Arrays Grades in an Array and a File 90 pts Happy Kan
import java.util.*;
import java.io.*;
public class GradesInAnArrayAndAFile
{
    public static void main (String[]args) throws Exception
    {
        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();
        int a[] = new int[5];
        System.out.print("Name (first last): ");
        String fname = keyboard.next();
        String lname = keyboard.next();
        System.out.print("Filename: ");
        String filename = keyboard.next();
        FileWriter fw = new FileWriter (filename);
        fw.write(fname+" " +lname);
        fw.write("\n");
        System.out.println();
        System.out.println("Here are you randomly selected grades (hope you pass): " );
        for (int i=0; i<a.length; i++)
        {
            a[i] = 1+r.nextInt(100);
            fw.write(a[i] + " ");
            System.out.println("Grade " + (i+1)+ " : " + a[i]);
        }
        fw.close();
        System.out.println();
        System.out.println("Data saved in \""+filename+"\".");
    }
}