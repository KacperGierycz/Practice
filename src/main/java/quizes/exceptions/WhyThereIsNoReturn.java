package quizes.exceptions;

public class WhyThereIsNoReturn {

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
            i = i + 3;
       //     return i;
        }

        System.out.println(i);
        // there is no return when there is no return
        return i;
    }

    public static void main(String[] args)
    {
        System.out.println(anyMethod());
    }

}
