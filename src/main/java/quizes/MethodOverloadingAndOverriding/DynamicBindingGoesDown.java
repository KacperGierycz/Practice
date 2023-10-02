package quizes.MethodOverloadingAndOverriding;

public class DynamicBindingGoesDown {

    class ABC
    {
        void methodABC()
        {
            System.out.println(111);
        }

        void methodABC(int i)
        {
            System.out.println(222);
        }
    }

    class XYZ extends ABC
    {



        @Override
        void methodABC(int i)
        {
            System.out.println(333);
        }

        @Override
        void methodABC()
        {
            System.out.println(444);
        }
    }

    public class MainClass
    {

    }

    public static void main(String[] args)
    {
        ABC abc = new DynamicBindingGoesDown(). new XYZ();

        abc.methodABC(10);

        abc.methodABC();
    }

}
