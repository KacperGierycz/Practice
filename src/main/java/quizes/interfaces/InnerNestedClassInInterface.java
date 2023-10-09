package quizes.interfaces;

public class InnerNestedClassInInterface {

    interface I
    {
        class C
        {
            int i;

            public C(int i)
            {
                this.i = ++i;
            }

            int methodC()
            {
                return ++i;
            }
        }
    }

    public class MainClass
    {

    }

    public static void main(String[] args)
    {
        I.C c = new I.C(000);

        System.out.println(c.methodC());
    }

}
