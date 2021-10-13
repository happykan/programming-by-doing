//Functions Area Calculator 110 pts Happy Kan
import java.util.Scanner;
public class AreaCalculator
{
    public static void main(String[]args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println( "Shape Area Calculator.");
        System.out.println();
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=--=-=--=-=-=");
        System.out.println();
        int choice;
        do
        {
            System.out.println("1) Triangle");
            System.out.println("2) Rectangle");
            System.out.println("3) Square");
            System.out.println("4) Circle");
            System.out.println("5) Quit");
            System.out.print("Which shape: ");
            choice = keyboard.nextInt();
            System.out.println();
            if (choice==1)
            {
                System.out.print("Base: ");
                int base = keyboard.nextInt();
                System.out.print("Height: ");
                int height = keyboard.nextInt();
                System.out.println();
                System.out.println("The area is " + area_triangle(base,height) + "." );
                System.out.println();
                System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=--=-=--=-=-=");
                System.out.println();
            }
            else if (choice==2)
            {
                System.out.print("Length: ");
                int length = keyboard.nextInt();
                System.out.print("Width: ");
                int width = keyboard.nextInt();
                System.out.println();
                System.out.println( "The area is " + area_rectangle(length,width) + "." );
                System.out.println();
                System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=--=-=--=-=-=");
                System.out.println();
            }
            else if (choice==3)
            {
                System.out.println("Side length: ");
                int side = keyboard.nextInt();
                System.out.println();
                System.out.println( "The area is " + area_square(side) + ".");
                System.out.println();
                System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=--=-=--=-=-=");
                System.out.println();
            }
            else if (choice==4)
            {
                System.out.println("Radius: ");
                double radius = keyboard.nextDouble();
                System.out.println();
                System.out.println( "The area is " + area_circle(radius) + ".");
                System.out.println();
                System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=--=-=--=-=-=");
                System.out.println();
            }

        }
        while (choice!=5 && choice<=4);
        System.out.println( "Goodbye." );
    }
    public static double area_circle( double radius )
        {
            double A;
            A = Math.PI*radius*radius;
            return A;
        }
    public static int area_rectangle( int length, int width )
        {
            int B;
            B = length*width;
            return B;
        }
    public static int area_square( int side )
        {
            int C;
            C = side*side;
            return C;
        }
    public static double area_triangle( int base, int height )
        {
            double D;
            D = (base*height)/2;
            return D;
        }
}