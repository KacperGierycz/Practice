package quizes.nestedClasses;

public class CyclicCall {


        {
            new B();
        }

        static class B
        {
            {
                new CyclicCall().new C();
            }
        }

        class C
        {
            {
                System.out.println("SUCCESS");
            }
        }
    }


