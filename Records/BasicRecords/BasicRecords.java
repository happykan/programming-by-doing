//Records Basic Records 80 pts Happy Kan
import java.util.Scanner;

class Student
{
    String name;
    int grade;
    double avg;

    void insert(String namee, int gradee, double avgg)
    {
        name = namee;
        grade = gradee;
        avg = avgg;
    }

    void print()
    {
        System.out.println(name);
        System.out.println(grade);
        System.out.println(avg);
    }
}
public class BasicRecords
{
    public static void main (String[]args)
    {
        Scanner fin = new Scanner (System.in);

        String test = fin.nextLine();
        int test2 = fin.nextInt();
        double test3 = fin.nextDouble();
        String test4 = fin.nextLine();

        Student oneS = new Student();
        
        oneS.insert(test,test2,test3);

        test = fin.nextLine();
        test2 = fin.nextInt();
        test3 = fin.nextDouble();
        test4 = fin.nextLine(); 

        Student second = new Student();

        second.insert(test,test2,test3);

        test = fin.nextLine();
        test2 = fin.nextInt();
        test3 = fin.nextDouble();
        test4 = fin.nextLine();

        Student third = new Student();    

        third.insert(test,test2,test3);

        test = fin.nextLine();
        test2 = fin.nextInt();
        test3 = fin.nextDouble();
        test4 = fin.nextLine();

        //System.
        // oneS.name = fin.next();
        // oneS.grade = fin.nextInt();
        // oneS.avg = fin.nextDouble();

        oneS.print();
        second.print();
        third.print();

        System.out.print("The names are: " + test);
    }
}
