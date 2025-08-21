// break statement exiting a for statement
// break statement, when executed in a while, for, do-while or switch, 
// causes immediate exit from that statement.

public class BreakContinue 
{
    public static void main(String[] args)
    {
        int count;
        for (count = 0; count <= 10; count++)
        {
            if (count == 7) // if count is 7, terminate loop
            {
                break;
            }
            System.out.println(count);
        }
        System.out.println("Broke out of loop at count = " + count);
    }
}


// // continue statement terminating an iteration of a for statement
// // continue statement, when executed in a while, for or do-while, 
// // skips remaining statements in loop body and proceeds with next iteration of loop.

// public class BreakContinue 
// {
//     public static void main(String[] args)
//     {
//         for (int count = 0; count <= 10; count++)
//         {
//             if (count == 7) // if count is 7, skip remaining code in loop
//             {
//                 continue;
//             }
//             System.out.println(count);
//         }
//         System.out.println("Used continue to skip printing 7");
//     }
// }