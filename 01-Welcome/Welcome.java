// // my first java program

// public class Welcome 
// // class keyword -> indicates class declaration
// // Welcome -> class name(begins with capital letter)
// // saved file name or class name must be same
// {
//     public static void main(String[] args) 
//     // void method -> will not return any information
//     // main method -> begins execution of a program
//     // parenthesis indicates a method
//     // String[] args -> required part of method main's declaration
//     {
//         System.out.println("Welcome to Java Programming!"); 
//         // this entire line is called statement
//         // System.out -> Standard output object
//         // System.out.println -> prints line of text in command window/terminal window/command line/shell
//         // "Welcome to Java Programming!" -> String of characters(Argument)/Character String/String Literal
    
//         System.out.printf( "%s\n%s\n", "Welcome to", "Java Programming!" );
//         // Displaying Text with printf -> System.out.printf method (f means "formatted") displays formatted data

//     }
// }


// // sum of two numbers
// import java.util.Scanner; // program uses class Scanner

// public class Welcome 
// {
//     public static void main(String[] args) 
//     {
//         Scanner input = new Scanner(System.in);
//         // Scanner -> read data from user
//         // System.in -> read bytes of information typed by user

//         System.out.print("Enter 1st number: "); // Prompting user for Input
//         int num1 = input.nextInt(); // read input from user
//         // Obtaining int as Input from user
//         System.out.print("Enter 2nd number: "); 
//         int num2 = input.nextInt();

//         int sum = num1 + num2;
//         System.out.print("Sum: " + sum);
//     }
// }


// // Compare integers using if statements, relational and equality operators
// import java.util.Scanner; 

// public class Welcome 
// {
//     public static void main(String[] args) 
//     {
//         Scanner input = new Scanner(System.in);

//         System.out.print("Enter 1st number: "); 
//         int num1 = input.nextInt(); 
//         System.out.print("Enter 2nd number: "); 
//         int num2 = input.nextInt();

//         if (num1 == num2)
//         {
//             System.out.print(num1 + " = " + num2);
//         }
//         else if (num1 <= num2)
//         {
//             System.out.print(num1 + " <= " + num2);
//         }
//         else
//         {
//             System.out.print(num1 + " >= " + num2);
//         }
//     }
// }


// Class declaration with one method.
class display_welcome 
{
    public void display() // method header
    { 
        System.out.println("Welcome to Java Programming!");
    }
}

public class Welcome 
{
    public static void main(String[] args) 
    {
        // create a display_welcome object and assign it to dw
        display_welcome dw = new display_welcome(); // creates class instance

        // call dw's display method
        dw.display();
    }
}
