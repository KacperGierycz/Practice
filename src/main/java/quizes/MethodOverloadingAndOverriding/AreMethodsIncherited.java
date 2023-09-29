package quizes.MethodOverloadingAndOverriding;

public class AreMethodsIncherited {

    class A
    {
        int o = 0;

        int myMethod( int j)
        {
            return j;
        }
    }

    class B extends A
    {

 int o=10;

        int myMethod(int i, int j)
        {
            System.out.println( super.myMethod(j));
            return i * j;
        }
    }

    public class MainClass
    {
        public static void main(String[] args)
        {
            AreMethodsIncherited.A a = new AreMethodsIncherited().new A();
            AreMethodsIncherited.B b = new AreMethodsIncherited().new B();

            a.myMethod(2);
            b.myMethod(2,2);

        }
    }

    public static void main(String[] args)
    {
        AreMethodsIncherited.A a = new AreMethodsIncherited().new A();
        AreMethodsIncherited.B b = new AreMethodsIncherited().new B();

        System.out.println(a.myMethod(3));
        System.out.println(b.myMethod(2,3));
        System.out.println(b.myMethod(5));

        System.out.println(a.o);
        System.out.println(b.o);
    }


}
