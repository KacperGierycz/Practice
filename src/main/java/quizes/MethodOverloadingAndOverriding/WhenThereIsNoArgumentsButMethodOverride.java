package quizes.MethodOverloadingAndOverriding;

public class WhenThereIsNoArgumentsButMethodOverride {

    class A
    {
        static void methodOne()
        {
            System.out.println("AAA");
        }
    }

    class B extends A
    {
        static void methodOne()
        {
            System.out.println("BBB");
        }
    }

    public class MainClass
    {
        public static void main(String[] args)
        {
            A a = new WhenThereIsNoArgumentsButMethodOverride(). new B();

            a.methodOne();
        }
    }

    public static void main(String[] args)
    {
        A a = new WhenThereIsNoArgumentsButMethodOverride(). new B();
        B b = new WhenThereIsNoArgumentsButMethodOverride(). new B();
        a.methodOne();
        b.methodOne();
    }

}
