package quizes.interfaces;

public class BeCarefulWhenFieldsAreInDifferentScopes {

    interface X
    {
        char c = 'A';

        char methodX();
    }

    class Y implements X
    {
        {
            System.out.println(c);
        }

        public char methodX()
        {
            char c = this.c;

            return ++c;
        }
    }

    public class MainClass
    {

    }

    public static void main(String[] args)
    {
        Y y = new BeCarefulWhenFieldsAreInDifferentScopes(). new Y();

        System.out.println(y.methodX());

        System.out.println(y.c);

        System.out.println(X.c);
    }

}
