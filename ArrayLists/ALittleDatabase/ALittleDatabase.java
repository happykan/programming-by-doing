//Records A Little Database 100 pts Happy Kan
import java.util.*;
class Student
{
    String name;
    int grade;
    double avg;
}
public class ALittleDatabase
{
    public static void main (String[]args)
    {
        Scanner fin = new Scanner(System.in);

        Student one = new Student();
        Student two = new Student();
        Student three = new Student();

        System.out.print("Enter student 1's name: ");
        one.name = fin.next();
        System.out.print("Enter student 1's grade: ");
        one.grade = fin.nextInt();
        System.out.print("Enter student 1's average: ");
        one.avg = fin.nextDouble();
        System.out.println();

        System.out.print("Enter 2's student name: ");
        two.name = fin.next();
        System.out.print("Enter 2's student grade: ");
        two.grade = fin.nextInt();
        System.out.print("Enter 2's student average: ");
        two.avg = fin.nextDouble();
        System.out.println();

        System.out.print("Enter 3's student name: ");
        three.name = fin.next();
        System.out.print("Enter 3's student grade: ");
        three.grade = fin.nextInt();
        System.out.print("Enter 3's student average: ");
        three.avg = fin.nextDouble();
        System.out.println();

        System.out.print("The names are: " + one.name + " " + two.name + " " + three.name);
        System.out.println();
        System.out.print("The grades are: " + one.grade + " " + two.grade + " " + three.grade);
        System.out.println();
        System.out.print("The averages are: " + one.avg + " " + two.avg + " " + three.avg);
        System.out.println();

    }
}