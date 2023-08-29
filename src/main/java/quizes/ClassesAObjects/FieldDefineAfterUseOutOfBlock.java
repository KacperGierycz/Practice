package quizes.ClassesAObjects;

public class FieldDefineAfterUseOutOfBlock {

    int ii = 10;

    {
        System.out.println(ii);
    }


    static
    {
        i = 20;
       // System.out.println(i);
    }

    static int i = 10;


}
