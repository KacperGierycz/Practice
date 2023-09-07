package quizes.inheritance;


    class X
    {
        int m = 1111;

        {
            System.out.println("First m" + m);

            //this is an error it gives 1111
             m = m++;

            System.out.println("After reassigning and incrementing with m++" + m);

        //    System.out.println(m++ + ++m );

        }
    }

    class Y extends X
    {
        {
            System.out.println(methodOfY());
        }

        int methodOfY()
        {

            // the post increment is affecting the variable if there is next operand in the sequence.
            System.out.println("m from method in Y" + m);


            return m-- + --m + m-- + --m;
        }
    }

    public class MainClassXY
    {
        public static void main(String[] args)
        {
            Y y = new Y();
        }
    }


