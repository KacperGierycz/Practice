package quizes.exceptions;


import java.io.IOException;

public class SuperClassException {

        void anyMethod()
        {
            System.out.println("Super Class Method");
        }
    }

    class SubClass extends SuperClassException
    {
        @Override
        void anyMethod()// throws IOException
        {
            System.out.println("Sub Class Method");
        }


}
