//  Counter-Controlled Repetition
//  Sentinel-Controlled Repetition
import java.util.Scanner;

class GradeBook2
{
    private String courseName;

    public GradeBook2(String name) 
    {
        courseName = name;
    }

    public void setCourseName(String name) 
    {
        courseName = name;
    }

    public String getCourseName() 
    {
        return courseName;
    }

    public void displayMessage() 
    {
        System.out.println("Welcome to grade book for " + getCourseName());
    }

    // public void determineClassAverage() // cc
    // {
    //     Scanner input = new Scanner(System.in);

    //     int total = 0;
    //     int gradeCounter = 0;
    //     int grade = 1;

    //     while (gradeCounter <= 5)
    //     {
    //         System.out.print("Enter grade: "); 
    //         grade = input.nextInt();
    //         total += grade;
    //         gradeCounter++;
    //     }

    //     float average = (float) total / 5;

    //     System.out.println("Total of all 5 grades is " + total); 
    //     System.out.println("Class average is " + average);
    // }

    public void determineClassAverage() // sc
    {
        Scanner input = new Scanner(System.in);

        int total = 0;
        int gradeCounter = 0;

        System.out.print( "Enter grade or -1 to quit: " ); 
        int grade = input.nextInt();

        while (grade != -1)
        {
            total += grade;
            gradeCounter++;
            System.out.print( "Enter grade or -1 to quit: " ); 
            grade = input.nextInt();
        }

        if (gradeCounter != 0)
        {
            float average = (float) total / gradeCounter;

            System.out.println("Total of all " + gradeCounter + " grades is " + total);
            System.out.println("Class average is " + average);
        }
        else
        {
            System.out.println( "No grades were entered" );
        }
    }
}

public class GradeBookTest2
{
    public static void main(String[] args) 
    {
        GradeBook2 gb2 = new GradeBook2("Java Programming!");
        gb2.displayMessage();
        gb2.determineClassAverage();
    }
}
