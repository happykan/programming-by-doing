//Random Numbers Fortune Cookie 15-25 pts Happy Kan
import java.util.Random;
public class FortuneCookie
{
    public static void main( String[]args )
    {
        Random r = new Random();

        int x = 1 + r.nextInt(6);

        System.out.print( 1 + r.nextInt(54) + " - " );
        System.out.print( 1 + r.nextInt(54) + " - " );
        System.out.print( 1 + r.nextInt(54) + " - " );
        System.out.print( 1 + r.nextInt(54) + " - " );
        System.out.print( 1 + r.nextInt(54) + " - " );
        System.out.print( 1 + r.nextInt(54) );
        System.out.println();

        System.out.println( "Fortune cookie says: " );

        if ( x==1 )
        {
            System.out.print( "\"You will find happiness with a new love\"" );
        }
        else if ( x==2 )
        {
            System.out.print( "\"You will die.\"" );
        }
        else if ( x==3 )
        {
            System.out.print( "\"You will be sick.\"" );
        }
        else if ( x==4 )
        {
            System.out.print( "\"You will be promoted.\"" );
        }
        else if ( x==5 )
        {
            System.out.print( "\"You will be rich/\"" );
        }
        else if ( x==6 )
        {
            System.out.print( "\"You will have good grades.\"" );
        }
    }
}