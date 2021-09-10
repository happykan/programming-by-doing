//If Statements P2 Gender Game pts 50 Happy Kan
import java.util.Scanner;
public class GenderGame
{
    public static void main ( String[]args )
    {
        Scanner keyboard = new Scanner (System.in);

        System.out.println( "What is your gender (Male or Female) " );
        String gender = keyboard.next();
        System.out.println( "First name: " );
        String first_name = keyboard.next();
        System.out.println( "Last name: ");
        String last_name = keyboard.next();
        System.out.println( "Age: ");
        int age = keyboard.nextInt();
        System.out.println();
        
        if ( gender.equals ("Female") )
        {
            if ( age>=20 )
            {
                System.out.println( "Are you married, " + first_name + " (yes or no)? " );
                String answer5 = keyboard.next();
                System.out.println();
                if ( answer5.equals ("yes") )
                {
                    System.out.println( "Then I shall call you " + "Mrs. " + last_name + "." );
                }
                else if ( answer5.equals ("no") )
                {
                    System.out.println( "Then I shall call you " + "Ms. " + last_name + "." );
                }
            }
            else if ( age<20 )
            {
                System.out.println( "Then I shall call you " + first_name + " " + last_name + "." );
            }
        }
        else if ( gender.equals ("Male") )
        {
            if ( age>=20 )
            {
                System.out.println( "Then I shall call you Mr. " + last_name + "." );
            }
            else if ( age<20 )
            {
                System.out.println( "Then I shall call you " + first_name + " " + last_name + "." );
            }
        }
    }
}