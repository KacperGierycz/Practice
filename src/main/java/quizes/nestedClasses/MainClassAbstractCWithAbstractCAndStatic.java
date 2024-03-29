package quizes.nestedClasses;

abstract class AbstractCWithAbstractCAndStatic {


        static String s1 = "STATIC";

        String s2 = "NON-STATIC";

        abstract void methodX();

        static abstract class Y
        {
            String s1 = "NON-STATIC";

            static String s2 = "STATIC";

            abstract void methodY();
        }
    }

    public class MainClassAbstractCWithAbstractCAndStatic
    {
        public static void main(String[] args)
        {
            new AbstractCWithAbstractCAndStatic()
            {
                void methodX()
                {
                    System.out.println(s1+" "+s2);
                }
            }.methodX();

            new AbstractCWithAbstractCAndStatic.Y()
            {
                void methodY()
                {
                    System.out.println(s1+" "+s2);
                }
            }.methodY();
        }


}
