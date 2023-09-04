package quizes.ClassesAObjects;

public class BeCarefulWithNotInitializedInstances {

        char c = 'A';

    BeCarefulWithNotInitializedInstances a;

        {
            System.out.println(c);

            c = 'B';
        }

        public BeCarefulWithNotInitializedInstances(BeCarefulWithNotInitializedInstances a)
        {
            this.a = a;
        }

        public static void main(String[] args)
        {
            BeCarefulWithNotInitializedInstances a = null;

            a = new BeCarefulWithNotInitializedInstances(a);

            System.out.println(a.c);

            System.out.println(a.a.c);

            System.out.println(a.a.a.c);

            System.out.println(a.a.a.a.c);

            a.a.a.a.a.c = 'Z';

            System.out.println(a.c);
        }


}
