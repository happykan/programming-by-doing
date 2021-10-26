import java.util.Scanner;
public class PythagoreanCalc
{
    public static void main(String[]args)
    {
        Scanner keyboard = new Scanner(System.in);
        String response;
        do
        {
            System.out.println("A^2 + B^2 = C^2");
            System.out.println("Solving for Hypotenuse (h) or Leg (l)?");
            String ans = keyboard.next();
            if (ans.equalsIgnoreCase("h"))
            {
                System.out.println("Enter side A");
                double A = keyboard.nextDouble();
                System.out.println("Enter side B ");
                double B = keyboard.nextDouble();
                double C = (Math.sqrt(Math.pow(A,2)+Math.pow(B,2)));
                System.out.println("Side C is: " + C);
            }
            else if (ans.equalsIgnoreCase("L"))
            {
                System.out.println("Enter side A");
                double A = keyboard.nextDouble();
                System.out.println("Enter side C");
                double C = keyboard.nextDouble();
                double B = (Math.sqrt(Math.pow(C,2)-Math.pow(A,2)));
                System.out.println("Side B is: " + B);
            }
            System.out.println();
            System.out.println("Solve another Triangle? (y/n)");
            response = keyboard.next();
        }while(response.equals("y"));
        System.out.println();
        System.out.println("Thank you for using this program!");
        

    }
}