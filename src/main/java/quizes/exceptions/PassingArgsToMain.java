package quizes.exceptions;

public class PassingArgsToMain {

    public static void main(String[] args)
    {
        try
        {
            main(args);
        }
        catch (NumberFormatException | NullPointerException e)
        {
            System.out.println(1);
        }
        catch (Exception | Error e)
        {

            System.out.println(e.getCause());
            System.out.println(2);
        }
    }

}
