package quizes.exceptions;

public class IncrementationInTryCatchFinally {

    static int anyMethod()
    {
        int i = 1;

        try
        {
            i = i + 1;

            return i;
        }
        catch (Exception e)
        {
            i = i + 2;
        }
        finally
        {
            System.out.println("message from finally");
            i = i + 3;
            System.out.println(i);
        }

        System.out.println("return after return in try");
        return i;
    }

    public static void main(String[] args)
    {
        System.out.println(anyMethod());
    }

}
