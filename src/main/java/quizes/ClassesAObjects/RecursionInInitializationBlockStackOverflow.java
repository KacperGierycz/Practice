package quizes.ClassesAObjects;

public class RecursionInInitializationBlockStackOverflow {


        int i;

    RecursionInInitializationBlockStackOverflow a;

        {
            i = 10;

            a = new RecursionInInitializationBlockStackOverflow();
        }

        public static void main(String[] args)
        {
            RecursionInInitializationBlockStackOverflow a = new RecursionInInitializationBlockStackOverflow();

            System.out.println(a.a.a.a.a.a.i);
        }


}
