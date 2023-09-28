package quizes.MethodOverloadingAndOverriding;

public class ExtendedClassIsAnObjectButObjectIsNotExtendedC {

    class X
    {
        int i = 10;
        void calculate(int a, int b)
        {
            System.out.println("Class X");
        }
    }

    class Y extends X
    {
        int i = 20;
        @Override
        void calculate(int a, int b)
        {
            System.out.println("Class Y");
        }
    }

    class Z extends Y
    {
        int i = 30;
        @Override
        void calculate(int a, int b)
        {
            System.out.println("Class Z");
        }
    }

    public class MainClass
    {
        public static void main(String[] args)
        {
            X x = new ExtendedClassIsAnObjectButObjectIsNotExtendedC(). new Y();

            x.calculate(10, 20);


            Y y = (Y) x;

            y.calculate(50, 100);


            Z z = (Z) y;

            z.calculate(100, 200);

        }
    }

    public static void main(String[] args) {

        X x = new ExtendedClassIsAnObjectButObjectIsNotExtendedC(). new Y();
        X xx = new ExtendedClassIsAnObjectButObjectIsNotExtendedC().new X();
        Y yyy = new ExtendedClassIsAnObjectButObjectIsNotExtendedC().new Y();

        xx.calculate(10,20);
        x.calculate(10, 20);
        System.out.println(x.i);
        System.out.println(xx.i);
        System.out.println(yyy.i);
        Y y = (Y) x;
        Y yy = (Y) xx;

        y.calculate(50, 100);
        System.out.println(y.i);
        Z z = (Z) y;

        z.calculate(100, 200);
        System.out.println(z.i);
    }

}
