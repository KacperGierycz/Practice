package quizes.exceptions;

public class CatchWithPipe {
    public static void main(String[] args)
    {
        try
        {
            System.out.println(1);
        }
        catch (Exception e)
                // below is a format for using pipe in multiple exception catch.
//              | NumberFormatException |
//               NullPointerException e)
        {
            System.out.println(2);
        }
    }

}
