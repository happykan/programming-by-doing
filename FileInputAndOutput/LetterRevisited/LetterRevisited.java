//File Input and Output Letter Revisited 40 pts Happy Kan
import java.io.*;
public class LetterRevisited
{
    public static void main ( String[] args ) throws IOException
    {
        File letter = new File("letter.txt");
        FileWriter fw = new FileWriter(letter);
        PrintWriter pw = new PrintWriter(fw);

        pw.println("+------------------------------------------+");
        pw.println("|                                     #### |");
        pw.println("|                                     #### |");
        pw.println("|                                     #### |");
        pw.println("|                                          |");
        pw.println("|                                          |");
        pw.println("|                                          |");
        pw.println("|                       Happy Kan          |");
        pw.println("|                       232 Zongshan Road  |");
        pw.println("|                       Radmond. WA 98104  |");
        pw.println("+------------------------------------------+");

        pw.close();
    }
}