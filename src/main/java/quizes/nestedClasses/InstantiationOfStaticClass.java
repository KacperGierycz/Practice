package quizes.nestedClasses;

public class InstantiationOfStaticClass {

        {
            System.out.println(1);
        }

        static
        {
            System.out.println(2);
        }

        public InstantiationOfStaticClass()
        {
            new Y();
        }

        static class Y
        {
            {
                System.out.println(3);
            }

            static
            {
                System.out.println(4);
            }
        }
    }


