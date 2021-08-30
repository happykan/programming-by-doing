//Keyboard Input Asking Questions 10 pts Happy Kan

import java.util.Scanner;
public class AskingQuestions
{
    public static void main( String[] args)
    {
            Scanner keyboard = new Scanner(System.in);

            int age;
            String number_of_feet, number_of_inches;
            double weight;

            System.out.print( "How old are you? " );
            age = keyboard.nextInt();

            System.out.print( "How many feet tall are you? " );
            number_of_feet = keyboard.next();

            System.out.print( "And how mahy inches? " );
            number_of_inches = keyboard.next();

            System.out.print( "How much do you weight? " );
            weight = keyboard.nextDouble();

            System.out.println( "So you're " + age + " years old, " + number_of_feet + "'" + number_of_inches + "'" + " tall and " + weight + " heavy." );
    }
}
