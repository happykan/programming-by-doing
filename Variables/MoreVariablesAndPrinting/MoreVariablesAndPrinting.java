//Variables More Variables and Printing 7 pts Happy Kan
public class MoreVariablesAndPrinting
{
    public static void main( String[] args )
    {
        String Name, Eyes, Teeth, Hair;
        int Age, Height, Weight;
        double myHeight, myWeight;

        Name = "Zed A. Shaw";
        Age = 35;
        Height = 74;
        Weight = 180;
        Eyes = "Blue";
        Teeth = "White";
        Hair = "Brown";
        myHeight = 0.4535 * Weight;
        myWeight = 2.45 * Height;

        System.out.println( "Let's talk about " + Name + "." );
        System.out.println( "He's " + Height + " inches (or " + myHeight + "cm) tall." );
        System.out.println( "He's " + Weight + " pounds (or " + myWeight + "kg) heavy." );
        System.out.println( "Actually, that's not too heavy." );
        System.out.println( "He's got " + Eyes + " eyes and " + Hair + "hair." );
        System.out.println( "His teeth are usually " + Teeth + " depending on the coffee" );

        System.out.println( "If I add " + Age + ", " + Height + ", and " + Weight + " I get " + (Age + Height + Weight) + "." );
    }
}