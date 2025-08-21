// import java.util.Scanner;

// public class FindMaxMin
// {
//     public static void main(String[] args)
//     {
//         Scanner input = new Scanner(System.in);

//         int num;
//         int max, min;

//         System.out.print("Enter a number: ");
//         num = input.nextInt();

//         max = min = num;

//         for (int i = 0; i < 3; i++)
//         {
//             System.out.print("Enter a number: ");
//             num = input.nextInt();

//             if (num > max)
//             {
//                 max = num;
//             }
            
//             if (num < min)
//             {
//                 min = num;
//             }
//         }

//         System.out.println("Max: " + max);
//         System.out.println("Min: " + min);

//         input.close();
//     }
// }


// create separate methods to find the maximum and minimum values
import java.util.Scanner;

public class FindMaxMin
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int num;
        int max, min;

        System.out.print("Enter a number: ");
        num = input.nextInt();

        max = min = num;
 
        for (int i = 0; i <= 3; i++)
        {
            System.out.print("Enter a number: ");
            num = input.nextInt();

            max = findMax(num, max); 
            min = findMin(num, min);
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);

        input.close();
    }

    public static int findMax(int num, int max) 
    {
        if (num > max)
        {
            max = num;
        }
        return max;
    }

    public static int findMin(int num, int min) 
    {
        if (num < min)
        {
            min = num;
        }
        return min;
    }
}