//Keyboard Input Age in Five Years 18 pts Happy Kan
import java.util.Scanner;

public class AgeInFiveYears
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);

        String name;
        int years_old;

        System.out.print( "Hello. What is your name?" );
        name = keyboard.next();

        System.out.print( "Hi, " + name + "!" + " How old are you?" );
        years_old = keyboard.nextInt();

        System.out.println( "Did you know that in five years you will be " + (years_old + 5) + " years old?" );
        System.out.println( "And five years ago you were " + (years_old - 5) + "!" + " Imagine that !" );
    }
}