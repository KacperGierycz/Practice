package quizes.exceptions;

import java.io.IOException;

public class CompatibleTypesOfException {

        void anyMethod() throws IOException
        {
            System.out.println("Super Class Method");
        }
    }

    class SubClassOfCompatibleTypesOfException extends CompatibleTypesOfException
    {
        @Override
        void anyMethod() //throws Exception there has to clarity in exception types
        {
            System.out.println("Sub CLass Method");
        }
    }


