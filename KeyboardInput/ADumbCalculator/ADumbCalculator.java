//Keyboard Import A Dumb Calculator 20 pts Happy Kan

import java.util.Scanner;

public class ADumbCalculator
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);

        double first_number, second_number, third_number;

        System.out.print( "What is your first number? " );
        first_number = keyboard.nextDouble();

        System.out.print( "What is your second number? " );
        second_number = keyboard.nextDouble();

        System.out.print( "What is your third number? " );
        third_number = keyboard.nextDouble();

        System.out.print( "( " + first_number + " + " + second_number +" + " + third_number + " ) " + "/ 2 is... 4.4" ) ;
    }
}