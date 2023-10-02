package quizes.interfaces;

public class SubclassHasOverriddenMethod {

    interface A
    {
        void myMethod();
    }

    class B
    {
        public void myMethod()
        {
            System.out.println("My Method");
        }
    }

    class D {
        public void myMethod(){
            System.out.println("My DD Method");
        }
    }

    class C extends B implements A
    {

    }

    class DD extends D implements A{

    }



    public static void main(String[] args)
    {
        A a = new SubclassHasOverriddenMethod(). new C();

        a.myMethod();

        A d = new SubclassHasOverriddenMethod(). new DD();

        d.myMethod();
    }

}
