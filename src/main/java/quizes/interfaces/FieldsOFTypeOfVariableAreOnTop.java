package quizes.interfaces;

public class FieldsOFTypeOfVariableAreOnTop {

    interface One
    {
        String s = "FINAL";

        String methodONE();
    }

    interface Two
    {
        String methodONE();
    }

    abstract class Three
    {
        String s = "NOT FINAL";

        public abstract String methodONE();
    }

    class Four extends Three implements One, Two
    {
        public String methodONE()
        {
            String s = super.s + One.s;

            return s;
        }
    }

    public class MainClass
    {

    }

    public static void main(String[] args)
    {
        Four four = new FieldsOFTypeOfVariableAreOnTop(). new Four();

        System.out.println(four.methodONE());

        One one = four;

        System.out.println(one.s);
        System.out.println(one.methodONE());

    }

}
