import java.util.*;
public class DateCheck
{
    public static void main(String[]args)
    {
        Scanner keyboard = new Scanner(System.in);
        int year, day;
        int digit =0;
        String month;
        do
        {
            System.out.println("Enter the Year: ");
            year = keyboard.nextInt();
        }while (year<=1990 || year>2021);
        do 
        {
            System.out.println("Enter the Month: ");
            month = keyboard.next();
            while(true)
            {
                try
                {
                    digit = Integer.parseInt(month);
                    break;
                }
                catch (NumberFormatException e)
                {

                }
            }
            System.out.println("Enter the Month: ");
            month = keyboard.next();
        }while (digit<0 || digit>13);
        do 
        {
            System.out.println("Enter the Day:");
            day = keyboard.nextInt();
        }while (day<1 || day>31);
        System.out.println();
        System.out.println("Your birthday is " + year + "/" + month + "/" + day);
    }
}
