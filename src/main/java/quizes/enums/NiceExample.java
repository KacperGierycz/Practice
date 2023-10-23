package quizes.enums;

public class NiceExample {

    enum Levels
    {
        TOP, MEDIUM(10), BOTTOM(20, 30);

        int i, j;

        private Levels()
        {

        }

        private Levels(int i)
        {
            this.i = i;
        }

        private Levels(int i, int j)
        {
            this.i = i;

            this.j = j;
        }
    }


        public static void main(String[] args)
        {
            System.out.println(Levels.TOP.i);

            System.out.println(Levels.TOP.j);

            System.out.println(Levels.MEDIUM.i);

            System.out.println(Levels.MEDIUM.j);

            System.out.println(Levels.BOTTOM.i);

            System.out.println(Levels.BOTTOM.j);
        }


}
