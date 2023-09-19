package quizes.nestedClasses;

public class CantUseNonStaticMethodDirectlyFromStaticClassInstanceFirst {

    String s = "AAA";

    void methodA()
    {
        System.out.println(s);
    }

    static class B
    {
        void methodB()
        {
          //  methodA();
        }
    }

}
