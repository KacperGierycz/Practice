package quizes.inheritance;

public class InheritedFields1 {


        int i = 51;

        public InheritedFields1(int j)
        {
            System.out.println(i);

            this.i = j * 10;

        }
    }

    class InheritedFields2 extends InheritedFields1 {
        public InheritedFields2(int j) {
            super(j);

            System.out.println(i);

            this.i = j * 20;

        }
    }


