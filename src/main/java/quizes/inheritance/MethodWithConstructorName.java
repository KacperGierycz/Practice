package quizes.inheritance;

public class MethodWithConstructorName {


        void MethodWithConstructorName()
        {
            System.out.println(1);
        }
    }

    class MethodWithConstructorName2 extends MethodWithConstructorName
    {
        void MethodWithConstructorName2()
        {
            MethodWithConstructorName();
        }
    }


