// Class declaration with one method
class GradeBook 
{
    public void display() // method header
    { 
        System.out.println("Welcome to the Grade Book!");
    }
}

public class GradeBookTest1
{
    public static void main(String[] args) 
    {
        // create a GradeBook object and assign it to gb
        GradeBook gb = new  GradeBook(); // create class instance/object

        // call gb's display method
        gb.display();
    }
}


// // Class declaration with one method that has a parameter
// import java.util.Scanner;

// class GradeBook 
// {
//     public void display(String courseName)
//     { 
//         System.out.println("Welcome to the Grade Book " + courseName);
//     }
// }

// public class GradeBookTest1
// {
//     public static void main(String[] args) 
//     {
//         Scanner input = new Scanner(System.in);

//         GradeBook gb = new GradeBook();

//         System.out.print("Enter course name: "); 
//         String name = input.nextLine(); 

//         gb.display(name);
//     }
// }


// // set(assign values to) or get(obtain the values of) private instance variables(fields)
// import java.util.Scanner;

// class GradeBook
// {
//     private String courseName; // instance variable declaration

//     public void setCourseName(String name) 
//     {
//         courseName = name;
//     }

//     public String getCourseName()
//     {
//         return courseName;                                                                                                                                                                                                                                                                                                          
//     }

//     public void display() 
//     {
//         System.out.println("Welcome to the Grade Book " + getCourseName());
//     }
// }

// public class GradeBookTest1
// {
//     public static void main(String[] args) 
//     {
//         Scanner input = new Scanner(System.in);

//         GradeBook gb = new GradeBook();

//         System.out.print("Initial course name: " + gb.getCourseName());

//         System.out.print("\nEnter course name: "); 
//         String name = input.nextLine(); 
//         gb.setCourseName(name);

//         gb.display();
//     }
// }


// // constructor
// class GradeBook
// {
//     private String courseName; 

//     // constructor initializes courseName with String argument
//     public GradeBook(String name) 
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
// }

// public class GradeBookTest1
// {
//     public static void main(String[] args) 
//     {
//         GradeBook gb1 = new GradeBook("Introduction to Java");
//         GradeBook gb2 = new GradeBook("Introduction to Oop");

//         System.out.println("GradeBook1 course name: " + gb1.getCourseName());
//         System.out.println("GradeBook2 course name: " + gb2.getCourseName());
//     }
// }

