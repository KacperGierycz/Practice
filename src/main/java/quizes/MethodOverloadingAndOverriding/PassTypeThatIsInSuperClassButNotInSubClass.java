package quizes.MethodOverloadingAndOverriding;

public class PassTypeThatIsInSuperClassButNotInSubClass {

    class SuperClass
    {
        void superClassMethod(Number n)
        {
            System.out.println("From Super Class");
        }
    }

    class SubClass extends SuperClass
    {
        void superClassMethod(Double d)
        {
            System.out.println("From Sub Class");
        }

        int superClassMethod(Float f)
        {
            System.out.println("From Sub Class");
            return 10;
        }

//        int superClassMethod(float f)
//        {
//            System.out.println("From Sub Class");
//            return 10;
//        }

    }

    public class MainClass
    {
        public static void main(String[] args)
        {
            SubClass sub =new PassTypeThatIsInSuperClassButNotInSubClass(). new SubClass();

            sub.superClassMethod(123321);
        }
    }

    public static void main(String[] args) {
        SubClass sub =new PassTypeThatIsInSuperClassButNotInSubClass(). new SubClass();

        int i = 10;

        sub.superClassMethod(123321.00);
        sub.superClassMethod( i );
        sub.superClassMethod(123321f);


    }

}
