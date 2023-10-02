package quizes.interfaces;

public class InterfaceFieldsAreStaticAndPublic {

    interface A
    {
        int i = 111;
    }

    class B implements A
    {
        void methodB()
        {
            System.out.println(i);
        }
    }

}

