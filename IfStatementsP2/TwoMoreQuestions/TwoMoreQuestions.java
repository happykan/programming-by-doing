//If Statements P2 Two More Questions 35 pts Happy Kan
import java.util.Scanner;
public class TwoMoreQuestions
{
    public static void main( String[]args )
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println( "TWO MORE QUESTIONS, BABY!" );
        System.out.println();
        System.out.println( "Think of something and I'll try to guess it!" );
        System.out.println();
        System.out.println( "Question 1) Does it stay inside or outside or both? " );
        String answer1 = keyboard.next();
        System.out.println( "Questions 2) Is is a living thing? " );
        String answer2 = keyboard.next();
        System.out.println();

        if ( answer2.equals ("yes") && answer1.equals ("inside") )
        {
            System.out.println( "Then what else could you be thinking of besides a houseplant?" );
        }
        if ( answer2.equals ("yes") && answer1.equals ("outside") )
        {
            System.out.println( "Then what eles could you be thinking of besides a bison?" );
        }
        if ( answer2.equals ("yes") && answer1.equals ("both") )
        {
            System.out.println( "Then what eles could you be thinking of besides a dog?" );
        }
        if ( answer2.equals ("no") && answer1.equals ("inside") )
        {
            System.out.println( "Obviously the nonliving, inside/outside thing in your mind is a dead shower curtain." );
        }
        if ( answer2.equals ("no") && answer1.equals ("outside") )
        {
            System.out.println( "Obviously the nonliving, inside/outside thing in your mind is a dead billboard." );
        }
        if ( answer2.equals ("no") && answer1.equals ("outside") )
        {
            System.out.println( "Obviously the nonliving, inside/outside thing in your mind is a dead cellphone." );
        }
    }
}