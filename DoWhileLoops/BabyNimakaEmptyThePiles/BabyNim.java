//Do While Loops Baby Nim 60 pts Happy Kan
import java.util.Scanner;
public class BabyNim
{
    public static void main( String[]args )
    {
        Scanner keyboard = new Scanner(System.in);

        int pileA = 3;
        int pileB = 3;
        int pileC = 3;

        while (pileA>0 || pileB>0 || pileC>0)
        {
            System.out.print( "A: " + pileA + "   B: " + pileB + "   C: " + pileC );
            System.out.println();
            System.out.print( "Choose a pile: " );
            String choice = keyboard.next();
            System.out.println();
            System.out.print( "How many to remove from pile " + choice + ": " );
            int remove = keyboard.nextInt();
            keyboard.nextLine();

            if (choice.equals("A"))
            {
                pileA = pileA - remove;
            }
            else if (choice.equals("B"))
            {
                pileB = pileB - remove;
            }
            else if (choice.equals("C"))
            {
                pileC = pileC - remove;
            }
        }
        if (pileA<=0 && pileB<=0 && pileC<=0)
            {
                System.out.println( "All piles are empty. Good job!" );
            }
    }
}