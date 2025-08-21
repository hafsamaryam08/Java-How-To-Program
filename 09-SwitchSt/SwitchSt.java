// // use of switch statement to count letter grades
// import java.util.Scanner;

// class Switch
// {
//     private String courseName;
//     private int total;
//     private int gradeCounter;
//     private int aCount;
//     private int bCount;
//     private int cCount;
//     private int dCount;
//     private int fCount;

//     public Switch(String name) 
//     {
//         courseName = name;
//     }

//     public void setCourseName(String name) 
//     {
//         courseName = name;
//     }

//     public String getCourseName() 
//     {
//         return courseName;
//     }

//     public void displayMessage() 
//     {
//         System.out.println("Welcome to grade book for " + getCourseName());
//     }

//     public void inputGrades() 
//     {
//         Scanner input = new Scanner(System.in);

//         // System.out.println("Enter grades in the range 0-100.");
//         // System.out.println("Type end-of-file indicator to terminate input.");
//         // System.out.println("On UNIX/Linux/Mac OS X type <Ctrl> d then press Enter.");
//         // System.out.println("On Windows type <Ctrl> z then press Enter.");

//         System.out.println("Enter grades in the range 0-100 (enter -1 to exit):");
//         int grade = input.nextInt();

//         // while (input.hasNext())
//         while (grade != -1)
//         {
//             grade = input.nextInt();
//             total += grade;
//             ++gradeCounter;
//             incrementLetterGradeCounter(grade);
//         }
//     }

//     private void incrementLetterGradeCounter(int grade) 
//     {
//         switch (grade / 10) 
//         {
//             case 10:
//             case 9:
//                 ++aCount;
//                 break;
//             case 8:
//                 ++bCount;
//                 break;
//             case 7:
//                 ++cCount;
//                 break;
//             case 6:
//                 ++dCount;
//                 break;
//             default:
//                 ++fCount;
//                 break;
//         }
//     }

//     public void displayGradeReport() 
//     {
//         System.out.println("\nGrade Report:");

//         if (gradeCounter != 0) 
//         {
//             double average = (double) total / gradeCounter;
//             System.out.println("Total of " + gradeCounter + " grades entered: " + total);
//             System.out.println("Class average: " + average);
//             System.out.println("\nNumber of students who received each grade:");
//             System.out.println("A: " + aCount + "\nB: " + bCount + "\nC: " + cCount + "\nD: " + dCount + "\nF: " + fCount);
//         }
//         else 
//         {
//             System.out.println("No grades were entered");
//         }
//     }
// }

// public class SwitchSt 
// {
//     public static void main(String[] args) 
//     {
//         Switch s = new Switch("Java Programming!");

//         s.displayMessage();
//         s.inputGrades();
//         s.displayGradeReport();
//     }
// }


import java.util.Scanner;

class Switch
{
    private int total;
    private int gradeCounter;
    private int aCount;
    private int bCount;
    private int cCount;
    private int dCount;
    private int fCount;

    public void inputGrades() 
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter grades in the range 0-100 (enter -1 to exit):");
        int grade = input.nextInt();

        while (grade != -1)
        {
            grade = input.nextInt();
            total += grade;
            ++gradeCounter;
            
            switch (grade / 10) 
            {
                case 10:
                case 9:
                    ++aCount;
                    break;
                case 8:
                    ++bCount;
                    break;
                case 7:
                    ++cCount;
                    break;
                case 6:
                    ++dCount;
                    break;
                default:
                    ++fCount;
                    break;
            }
        }
    }

    public void displayGradeReport() 
    {
        System.out.println("\nGrade Report:");

        if (gradeCounter != 0) 
        {
            double average = (double) total / gradeCounter;
            System.out.println("Total of " + gradeCounter + " grades entered: " + total);
            System.out.println("Class average: " + average);
            System.out.println("\nNumber of students who received each grade:");
            System.out.println("A: " + aCount + "\nB: " + bCount + "\nC: " + cCount + "\nD: " + dCount + "\nF: " + fCount);
        }
        else 
        {
            System.out.println("No grades were entered");
        }
    }
}

public class SwitchSt 
{
    public static void main(String[] args) 
    {
        Switch s = new Switch();

        s.inputGrades();
        s.displayGradeReport();
    }
}
