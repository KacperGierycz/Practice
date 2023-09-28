package quizes.MethodOverloadingAndOverriding;

import com.sun.jdi.LongValue;

public class Primitives {

    class BX
    {
        Long method(Number n){
            System.out.println("number");
            return 100L;
        }
    }

    class X extends BX
    {
        int method(int i)
        {
            return i *= i;
        }
    }

    class Y extends X
    {
        double method(double d)
        {
            System.out.println(1);
            return d /= d;
        }
    }

    class Z extends Y
    {
        float method(float f)
        {
            return f += f;
        }

    }

    public class MainClass
    {
        public static void main(String[] args)
        {
            Z z = new Primitives(). new Z();

            System.out.println(z.method(21.12));
        }
    }

    public static void main(String[] args) {

        Long l = 10L;
        short ll = 10;
        Z z = new Primitives(). new Z();

        System.out.println(z.method(21.12));
        System.out.println(z.method(l));
        System.out.println(z.method(ll));

    }

}
