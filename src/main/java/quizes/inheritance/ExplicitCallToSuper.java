package quizes.inheritance;

public class ExplicitCallToSuper {

    class X
    {
        public X(){}

        public X(int i)
        {
            System.out.println(1);
        }
    }

    class Y extends X
    {
        public Y()
        {
            super(10);
            System.out.println(2);
        }
    }

}
