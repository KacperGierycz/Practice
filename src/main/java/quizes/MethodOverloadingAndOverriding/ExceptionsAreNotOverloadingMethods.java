package quizes.MethodOverloadingAndOverriding;

import java.io.IOException;

public class ExceptionsAreNotOverloadingMethods {

    class A
    {
        void myMethod() throws IOException
        {
            System.out.println("ONE");
        }

//        void myMethod() throws NumberFormatException
//        {
//            System.out.println("TWO");
//        }
//
//        void myMethod() throws ArrayIndexOutOfBoundsException
//        {
//            System.out.println("THREE");
//        }
    }

}
