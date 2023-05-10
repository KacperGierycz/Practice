package JustPractice;

import java.io.IOException;
import java.util.ArrayList;

public class JavaExceptionHandlingQuiz
{
    static int anyMethod()
    {
        int i = 1;

        try
        {
            i = i + 1;
            System.out.println(i);
            return i;

        }
        catch (Exception e)
        {
            i = i + 2;
        }
        finally
        {
            i = i + 3;
            System.out.println(i);
            return i;
        }
//        System.out.println("from return" + i);
       // return i;
//        System.out.println(i);
    }

    public static void main(String[] args)
    {
        System.out.println(anyMethod());
    }
}
