package quizes.exceptions;

import java.io.IOException;

public class SuperClassWithOneThrows {

    void anyMethod() throws Exception
    //throws IOException
    {
//        try{
//
//        }
//        catch(IOException ex){
//
//        }
        System.out.println("Super Class Method");
    }

}

class SubClassWithMoreThrows extends SuperClassWithOneThrows
{
    @Override
    void anyMethod() throws ArrayIndexOutOfBoundsException, NumberFormatException, ClassCastException, IOException
    {
        System.out.println("Sub Class Method");
    }

    public static void main(String[] args) throws IOException {
        SubClassWithMoreThrows clasForMethod = new SubClassWithMoreThrows();
        clasForMethod.anyMethod();
    }

}


