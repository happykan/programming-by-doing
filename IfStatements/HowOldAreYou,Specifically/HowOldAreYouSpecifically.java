//If Statements How Old Are You, Specifically pt 20 Happy Kan
import java.util.Scanner;
public class HowOldAreYouSpecifically
{
    public static void main ( String[]args )
    {
        Scanner keyboard = new Scanner (System.in);

        String name;
        int age;

        System.out.print( "Hey, what's your name? (Sorry, I keep forgetting.) " );
        name = keyboard.next();

        System.out.print( "Ok, " + name + " ," + " how old are you? ");
        age = keyboard.nextInt();

        if ( age < 16 )
        {
            System.out.println( "You can't dirve, " + name + "." );
        }        
        else if ( age <= 17 && age>=16)
        {
            System.out.println( "You can drive but not vote, " + name + "." );
        }
        else if ( age <= 24 && age >=18)
        {
            System.out.println( "You can vote but not rent a car, " + name + "." );
        }
        else if ( age >= 25 )
        {
            System.out.println( "You can do pretty much anything, " + name + "." );
        }


        
    }
}
