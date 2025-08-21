// floating point numbers and type double
// Account Class with an Instance Variable of Type double

import java.util.Scanner;

class Accounts
{
    // instance variable
    private double balance;

    // constructor
    public Accounts(double initialBalance)
    {
        if (initialBalance > 0)
        balance = initialBalance;
    }

    // credit (add) an amount to the account
    public void credit(double amount)
    {
        balance = balance + amount;
    }

    // return the account balance
    public double getBalance()
    {
        return balance;
    }
}

public class AccountTest
{
    public static void main(String[] args)
    {
        Accounts a1 = new Accounts(50.00);
        Accounts a2 = new Accounts(-7.53);

        System.out.println("Account1 balance: " + a1.getBalance());
        System.out.println("Account2 balance: " + a2.getBalance());

        Scanner input = new Scanner( System.in );

        double depositAmount;

        System.out.print("\nEnter deposit ammount for Account1: ");
        depositAmount = input.nextDouble();
        System.out.println("Adding " + depositAmount + " to Account1 balance");
        a1.credit(depositAmount);

        System.out.print("\nEnter deposit ammount for Account2: ");
        depositAmount = input.nextDouble();
        System.out.println("Adding " + depositAmount + " to Account2 balance");
        a2.credit(depositAmount);

        System.out.println("\nAccount1 balance: " + a1.getBalance());
        System.out.println("Account2 balance: " + a2.getBalance());
    }
}
