package quizes.enums;

public class AreFieldsOfEnumsStatic {

    enum Moves
    {
        UP
                {
                    @Override
                    int getValue()
                    {
                        return ++value;
                    }
                },

        DOWN
                {
                    @Override
                    int getValue()
                    {
                        return --value;
                    }
                },

        LEFT, RIGHT;

        int value = 5151;

        int getValue()
        {
            return value;
        }
    }


        public static void main(String[] args)
        {
            System.out.println(Moves.LEFT.getValue());

            System.out.println(Moves.UP.getValue());

            System.out.println(Moves.RIGHT.getValue());

            System.out.println(Moves.DOWN.getValue());

            System.out.println(Moves.LEFT.getValue());

            System.out.println(Moves.DOWN.getValue());
        }


}
