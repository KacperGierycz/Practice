package quizes.ClassesAObjects;

public class NumberDescendantsInitializeWithZero {

        int m;

        double n;

        public NumberDescendantsInitializeWithZero(int i)
        {
            m = i;
        }

        public NumberDescendantsInitializeWithZero(double d)
        {
            n = d;
        }

        {
            System.out.println(m);

            System.out.println(n);
        }

        public static void main(String[] args)
        {
            NumberDescendantsInitializeWithZero a1 = new NumberDescendantsInitializeWithZero(500);

            NumberDescendantsInitializeWithZero a2 = new NumberDescendantsInitializeWithZero(50.0);

            System.out.println(a1.m+" : "+a1.n);

            System.out.println(a2.m+" : "+a2.n);
        }


}
