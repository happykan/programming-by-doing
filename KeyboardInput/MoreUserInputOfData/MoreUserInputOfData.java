//Keyboard Input More User Input Of Data 16 points Happy Kan
import java.util.Scanner;

public class MoreUserInputOfData
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);

        String first_name, last_name, login;
        int grade, student_ID;
        double GPA;

        System.out.print( "First name:" );
        first_name = keyboard.next();

        System.out.print( "Last name: " );
        last_name = keyboard.next();

        System.out.print( "Grade (9-12): " );
        grade = keyboard.nextInt();

        System.out.print( "Student ID: " );
        student_ID = keyboard.nextInt();

        System.out.print( "Login: " );
        login = keyboard.next();

        System.out.print( "GPA (0.0-4.0): " );
        GPA = keyboard.nextDouble();

        System.out.println( "Your information:" );
        System.out.println( "       Login: " + login );
        System.out.println( "       ID: " + student_ID);
        System.out.println( "       Name: " + last_name + ", " + first_name);
        System.out.println( "       GPA: " + GPA);
        System.out.println( "       Grade: " + grade);

    }
}