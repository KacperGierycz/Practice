package quizes.exceptions;

public class ReturnInFinallyInVoid {
    static void anyMethod()
    {
        try
        {
            System.out.println("Try Block");
            return;
        }
        catch (Exception e)
        {
            System.out.println("Catch Block");
        }
        finally
        {
            System.out.println("Finally Block");
            return;
        }

   //     System.out.println("Any Statements");
    }

    public static void main(String[] args)
    {
        anyMethod();
    }

}
