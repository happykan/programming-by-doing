//If Statements P2 Choose Your Own Adventure pt 60 Happy Kan
import java.util.Scanner;
public class ChooseYourOwnAdventure
{
    public static void main( String[]args )
    {
        Scanner keyboard = new Scanner (System.in);

        String answer1 = "";
        String answer2 = "";
        String answer3 = "";

        System.out.println( "WELCOME TO MITCHELL'S TINY ADVENTURE!" );
        System.out.println();
        System.out.println( "You are in a creepy house! Would you like to go \"upstairs\" or into the \"kitchen\"?" );
        System.out.println("> ");
        answer1 = keyboard.next();
        if ( answer1.equals ("kitchen") )
        {
            System.out.println( "There is a long countertop with dirty dishes everywhere. Off to one side there is, as you'd expect, a refrigerator. You may open the \"refrigerator\" or look in a \"cabinet\"." );
            System.out.println("> ");
            answer2 = keyboard.next();
            if (answer2.equals("refrigerator") )
            {
                System.out.println( "Inside the refrigerator you see food and stuff. It looks pretty nasty. Would you like to eat some of the food? (\"yes\" or \"no\")" );
                System.out.println("> ");
                answer3 = keyboard.next();
                if (answer3.equals ("no") )
                {
                    System.out.println( "You die of starvation...eventually." );
                }
                else if (answer3.equals ("yes") )
                {
                    System.out.println( "You will have a stomach ache." );
                }
            }
            else if (answer2.equals("cabinet"))
            {
                System.out.println( "Game over" );
            }
        }
        else if ( answer1.equals ("upstairs") )
        {
            System.out.println( "Upstairs you see a hallway. At the end of the hallway is the master \"bedroom\". There is also a \"bedroom\" off the hallway. where would you like to go?" );
            System.out.println("> ");
            answer2 = keyboard.next();
            if (answer2.equals("bedroom") )
            {
                System.out.println( "You are in a plush bedroom, with expensive-looking hardwood furniture. The bed is unmade. In the back of the room, the closet door is ajar. Would you like to open the door? (\"yes\" or \"no\")" );
                System.out.println("> ");
                answer3 = keyboard.next();
                if (answer3.equals ("no") )
                {
                    System.out.println( "Well, then I guess you'll never know what was in there. Thanks for playing, I'm tired of making nested if statements." );
                }
                else if (answer3.equals ("yes") );
                {
                    System.out.println( "Good job! Thanks for playing." );
                }
            }
            else if (answer2.equals("bathroom") )
            {
                System.out.println( "You died." );
            }
        }
        

    }

}