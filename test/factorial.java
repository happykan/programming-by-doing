import java.util.*;
public class factorial
{
    public static BigInteger factorial (int num)
    {
        if (num<=1)
        {
            return BigInteger.ONE;
        }
        else
        {
            return factorial (num-1).multiply (BigInteger.valutOf(num));
        }
    }
}