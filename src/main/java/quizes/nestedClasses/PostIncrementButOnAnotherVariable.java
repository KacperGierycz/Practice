package quizes.nestedClasses;

public class PostIncrementButOnAnotherVariable {


        static int x = 3131;

        static class Y
        {
            static int y = x++;

            static class Z
            {
                static int z = y++;
            }
        }
    }

