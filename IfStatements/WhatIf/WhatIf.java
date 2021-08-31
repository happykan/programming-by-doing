//Statements What If 15 pts Happy Kan

public class WhatIf
{
    public static void main( String[] args )
    {
        int people = 20;
        int cats = 30;
        int dogs = 15;

        if ( people < dogs )
        {
            System.out.println( "Too many cats! The world is doomed!" );
        }

        if ( dogs > cats )
        {
            System.out.println( "Not many cats! The world is saved!" );
        }

        if ( people < dogs )
        {
            System.out.println( "The world is dry!" );
        }

        dogs += 5;

        if ( people >= dogs )
        {
            System.out.println( "People are greater than or equal to dogs." );
        }

        if ( people <= dogs )
        {
            System.out.println( "People are less than or equal to dogs." );
        }

        if ( people == dogs )
        {
            System.out.println( "People are dogs." );
            
        }
    }
}

//1. Using if creates two solutions: yes or no, it the statement is correct, then it will do the next statement.
//2. Make the computer only run the statement in the curly bracesy