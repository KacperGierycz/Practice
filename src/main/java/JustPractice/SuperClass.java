package JustPractice;

import java.io.IOException;

class SuperClass
{
    void anyMethod() throws IOException, IOException
    {
        System.out.println("Super Class Method");
    }
}

class SubClass extends SuperClass
{
    @Override
    void anyMethod() throws IOException//, ClassNotFoundException
    {
        System.out.println("Sub Class Method");
    }
}
