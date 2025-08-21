// create truth table for &&, ||, &, |, ^, ! 
public class LogicalOperators 
{
    public static void main(String[] args)
    {
        System.out.println("Conditional AND (&&)");
        System.out.println("true && true:\t" + (true && true));
        System.out.println("true && false:\t" + (true && false));
        System.out.println("false && true:\t" + (false && true));
        System.out.println("false && false:\t" + (false && false));

        System.out.println("\nConditional OR (||)");
        System.out.println("true || true:\t" + (true || true));
        System.out.println("true || false:\t" + (true || false));
        System.out.println("false || true:\t" + (false || true));
        System.out.println("false || false:\t" + (false || false));

        System.out.println("\nBoolean logical AND (&)");
        System.out.println("true & true:\t" + (true & true));
        System.out.println("true & false:\t" + (true & false));
        System.out.println("false & true:\t" + (false & true));
        System.out.println("false & false:\t" + (false & false));

        System.out.println("\nBoolean logical inclusive OR (|)");
        System.out.println("true | true:\t" + (true | true));
        System.out.println("true | false:\t" + (true | false));
        System.out.println("false | true:\t" + (false | true));
        System.out.println("false | false:\t" + (false | false));

        System.out.println("\nBoolean logical exclusive OR (^)");
        System.out.println("true ^ true:\t" + (true ^ true));
        System.out.println("true ^ false:\t" + (true ^ false));
        System.out.println("false ^ true:\t" + (false ^ true));
        System.out.println("false ^ false:\t" + (false ^ false));

        System.out.println("\nLogical NOT (!)");
        System.out.println("!true:\t" + (!true));
        System.out.println("!false:\t" + (!false));
    }    
}
