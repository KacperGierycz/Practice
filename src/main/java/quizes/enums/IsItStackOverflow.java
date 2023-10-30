package quizes.enums;

public class IsItStackOverflow {

    enum One
    {
        ONE;

        Two two = Two.TWO;

        int i = 1;
    }

    enum Two
    {
        TWO;

        One one = One.ONE;

        int i = 2;
    }

        public static void main(String[] args)
        {
            One one = One.ONE;

            Two two = Two.TWO;

            one.two = two;

            two.one = one;

            one.i = two.one.i = two.one.two.i;

            System.out.println(one.two.one.i);
            System.out.println(two.i);
            System.out.println(one.i);
            System.out.println(two.one.i);
            System.out.println(one.two.i);
            System.out.println(one.two.one.two.one.two.one.two.i);

        }


}
