package quizes.MethodOverloadingAndOverriding;

public class OverloadingTypeIsTakenTheClosestInHierarchy {

    class A
    {

    }

    class B extends A
    {

    }

    class C extends B
    {

    }

    public class MainClass
    {
        static void overloadedMethod(A a)
        {
            System.out.println("ONE");
        }

        static void overloadedMethod(B b)
        {
            System.out.println("TWO");
        }

        static void overloadedMethod(Object obj)
        {
            System.out.println("THREE");
        }

        public static void main(String[] args)
        {
            OverloadingTypeIsTakenTheClosestInHierarchy.C c = new OverloadingTypeIsTakenTheClosestInHierarchy(). new C();

            overloadedMethod(c);
        }
    }

    public static void main(String[] args) {

        OverloadingTypeIsTakenTheClosestInHierarchy.C c = new OverloadingTypeIsTakenTheClosestInHierarchy(). new C();

        MainClass.overloadedMethod(c);


    }

}
