//For Loops Noticing Even Numbers 30 pts Happy Kan
public class NoticingEvenNumbers
{
    public static void main(String[]args)
    {
        for (int n=1; n<=20; n=n+1)
        {
            if (n%2==0)
            {
                System.out.println( n+ "  <" );
            }
            else
            {
                System.out.println(n);
            }
        }
    }
}