// A college offers a course that prepares students for the state licensing exam for real
// estate brokers. Last year, ten of the students who completed this course took the exam.
// The college wants to know how well its students did on the exam. You’ve been asked to
// write a program to summarize the results. You’ve been given a list of these 10 students.
// Next to each name is written a 1 if the student passed the exam or a 2 if the student failed.
// Your program should analyze the results of the exam as follows:
// 1. Input each test result (i.e., a 1 or a 2). Display the message “Enter result” 
// on the screen each time the program requests another test result.
// 2. Count the number of test results of each type.
// 3. Display a summary of the test results, indicating the number of students 
// who passed and the number who failed.
// 4. If more than eight students passed the exam, print the message “Bonus to instructor!”

// Analysis of examination results using nested control statements
import java.util.Scanner;

public class Analysis 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner( System.in );

        int passes = 0; 
        int failures = 0; 
        int studentCounter = 1;
        int result;

        while (studentCounter <= 10)
        {
            System.out.print("Enter result (1 = pass, 2 = fail): ");
            result = input.nextInt();

            if (result == 1)
            {
                passes++; 
            }
            else 
            {
                failures++;
            }
            studentCounter++;
        }

        System.out.println( "Passed: " + passes + "\nFailed: " + failures);
        
        if (passes > 7)
        {
            System.out.println("Bonus to instructor!");
        }
    }
}
