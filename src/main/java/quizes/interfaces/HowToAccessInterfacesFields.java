package quizes.interfaces;

public class HowToAccessInterfacesFields {

    class P
    {
        interface Q
        {
            int i = 111;
        }

        int k =  P.Q.i;

    }

    public static void main(String[] args) {

        P p = new HowToAccessInterfacesFields(). new P();
        System.out.println(p.k);

        System.out.println(P.Q.i);


    }

    class ForFieldAccessFromInterface{

        public static void main(String[] args) {

            P p = new HowToAccessInterfacesFields(). new P();
            System.out.println(p.k);

            System.out.println(P.Q.i);

        }
    }

}
