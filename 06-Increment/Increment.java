// Prefix increment and postfix increment operators
public class Increment 
{
    public static void main(String[] args) 
    {
        int c;

        c = 5;
        System.out.println(c);
        System.out.println(c++);
        System.out.println(c);

        System.out.println();

        c = 5;
        System.out.println(c);
        System.out.println(++c);
        System.out.println(c);
    }
}


//  // Calculate the sum of integers from 1 to 10
// public class Increment 
// {
//     public static void main(String[] args) 
//     {
//         int sum = 0;
//         int x = 1;

//         while (x <= 10)
//         {
//             sum += x;
//             ++x;
//         }

//         System.out.println("Sum: " + sum);
//     }
// }


// // mystery
// public class Increment 
// {
//     public static void main(String[] args) 
//     {
//         int total = 0;
//         int x = 1;
//         int y;

//         while (x <= 10)
//         {
//             y = x * x;
//             System.out.println(y);
//             total += y;
//             ++x;
//         }

//         System.out.println("Total: " + total);
//     }
// }


// // mystery2
// public class Increment 
// {
//     public static void main(String[] args) 
//     {
//         int count = 1;

//         while (count <= 10)
//         {
//             System.out.println(count % 2 == 1 ? "****" : "++++++++");
//             ++count;
//         }
//     }
// }


// // mystery3
// public class Increment 
// {
//     public static void main(String[] args) 
//     {
//         int row = 10;

//         while (row >= 1)
//         {
//             int column = 1;

//             while (column <= 10)
//             {
//                 System.out.println(row % 2 == 1 ? "<" : ">");
//                 ++column;
//             }
//             --row;
//             System.out.println();
//         }
//     }
// }