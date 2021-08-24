//Basic and Printing Numbers and Math 7 pts Happy Kan
public class NumberAndMath
{
    public static void main( String[] args )
    {
        //The first line will be "I will now count my chickens:"
        System.out.println( "I will now count my chickens:" );
        //There are 30 Hens because 25+30/6=30. There are 97 Roosters because 100-25*3%4=97. 
        System.out.println( "Hens " + ( 25 + 30 / 6 ) );
        System.out.println( "Roosters " + ( 100 - 25 * 3 % 4 ) );
        //Print out "Now I will count the eggs:"
        System.out.println( "Now I will count the eggs:" );
        //The answer is the amount of eggs
        System.out.println( 3 + 2 + 1 - 5 +4 % 2 - 1 / 4 + 6 );
        //Print out "Is it true that 3+2<5-7"
        System.out.println( "Is it true that 3 + 2 < 5 - 7?" );
        //It will tell if 3+2 is bigger than 5-7
        System.out.println( 3 + 2 < 5 - 7 );
        //Print our "What is 3+2?" following the answer of 3+2; Print out "What is 5-7?" following the answer of 5-7  
        System.out.println( "What is 3 + 2? " + ( 3 + 2 ) );
        System.out.println( "What is 5 - 7? " + ( 5 - 7 ) );
        //Print out "Oh, that's why it's falso."
        System.out.println("Oh, that's why it's false." );
        //Print out the quote following true or false of the answer
        System.out.println( "Is it greater? " + ( 5 > -2 ) );
        System.out.println( "Is it greater or equal? " + ( 5 >= -2 ) );
        System.out.println( "Is it less or equal? " + ( 5 <= -2 ) );

    }
}