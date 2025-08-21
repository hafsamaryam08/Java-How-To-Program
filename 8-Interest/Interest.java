// A person invests $1000 in a savings account yielding 5% interest. Assuming that all the
// interest is left on deposit, calculate and print the amount of money in the account at the
// end of each year for 10 years. Use the following formula to determine the amounts:
// a=p (1 + r)n
// where
// p is the original amount invested (i.e., the principal)
// r is the annual interest rate (e.g., use 0.05 for 5%)
// n is the number of years
// a is the amount on deposit at the end of the nth year.

// Compound-interest calculations with for
public class Interest 
{
    public static void main(String[] args)
    {
        double principal = 1000;
        double rate = 0.05;

        System.out.println("Year\tAmount on Deposit");

        for (int year = 1; year <= 10; year++)
        {
            double amount = principal * Math.pow(1 + rate, year);

            System.out.println(year + "\t" + String.format("%.2f", amount));
        }
    }
}
