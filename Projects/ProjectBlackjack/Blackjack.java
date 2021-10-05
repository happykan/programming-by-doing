import java.util.Scanner;
import java.util.Random;
public class Blackjack
{
    public static void main( String[]args )
    {
        Random r = new Random();
        Scanner keyboard = new Scanner(System.in);

        System.out.println( "Welcome to Mitchell's blackjack program!" );

        int player_card1, player_card2;
        int dealer_card1, dealer_card2;
        String choice;
    
        player_card1 = 2+r.nextInt(10);
        player_card2 = 2+r.nextInt(10);
        dealer_card1 = 2+r.nextInt(10);
        dealer_card2 = 2+r.nextInt(10);

        System.out.println( "You get a " + player_card1 + " and a " + player_card2 + "." );
        int player_total = (player_card1 + player_card2);
        System.out.println( "Your total is " + player_total );
        System.out.println();

        System.out.println( "The dealer has a " + dealer_card1 + " showing, and a hidden card." );
        int dealer_total = (dealer_card1 + dealer_card2);
        System.out.println( "His total is hidden, too." );
        System.out.println();

        do
        {
            System.out.print( "Would you like to \"hit\" or \"stay\"?" );
            choice = keyboard.next();
            if (choice.equals ("hit"))
            {
                int new_card = 2+r.nextInt(10);
                System.out.println( "You drew a " + new_card + "." );
                player_total += new_card;
                System.out.println( "Your total is " + player_total + "." );
            }
        } while (player_total<=21 && (! choice.equals("stay")));

            if (player_total<=21)
            {
                System.out.println();
                System.out.println( "Okay, dealer's turn." );
                System.out.println( "His hidden card was a " + dealer_card2 + "." );
                System.out.println( "His total was " + dealer_total + "." );
                
                do
                {
                    if (dealer_total<17)
                    {
                        choice = "hit";
                        System.out.println( "Dealer chooses to hit." );
                        int new_card_dealer = 2+r.nextInt(10);
                        System.out.println( "He draws a " + new_card_dealer + "." );
                        dealer_total += new_card_dealer;
                        System.out.println( "His total is " + dealer_total + "." );
                    }
                    else
                    {
                        choice = "stay";
                        System.out.println( "Dealer stays.\n" );
                    }
                }while (dealer_total<=21 && (! choice.equals ("stay")));

            }
            System.out.println( "Dealer's total is " + dealer_total + "." );
            System.out.println( "Your total is " + player_total + "." );

            if (player_total<=21)
            {
                if (dealer_total<=21)
                {
                    if (player_total>dealer_total)
                    {
                        System.out.println( "YOU WIN!" );
                    }
                    else if (player_total<dealer_total)
                    {
                        System.out.println( "DEALER WIN!" );
                    }
                    else if (dealer_total==player_total)
                    {
                        System.out.println( "DEALER WIN!" );
                    }
                }
                else if (dealer_total>21)
                {
                    System.out.println( "YOU WIN!" );
                }
                
            }
            else
            {
                System.out.println( "DEALER WIN!" );
            }
    }
}