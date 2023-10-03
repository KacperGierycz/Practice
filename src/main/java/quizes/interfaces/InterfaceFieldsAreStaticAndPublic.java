package quizes.interfaces;

public class InterfaceFieldsAreStaticAndPublic {

    interface A
    {
        int i = 111;
    }

    class B implements A
    {

         int j = i;
        void methodB()
        {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        B b = new InterfaceFieldsAreStaticAndPublic().new B();
        int k = b.j;
        int l =  A.i;
        int p = b.i;
    }


}

