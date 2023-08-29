package quizes.ClassesAObjects;

public class FieldDefineAfterUseOutOfBlock {

    int ii = 10;

    {
        System.out.println(ii);
    }

    {
        System.out.println(ii);
    }

    static int i = 10;


}
