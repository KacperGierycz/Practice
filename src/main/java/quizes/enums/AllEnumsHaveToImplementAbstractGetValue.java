package quizes.enums;

public class AllEnumsHaveToImplementAbstractGetValue {

    enum Enums
    {
        FIRST
                {
                    @Override
                    int getValue()
                    {
                        return value;
                    }
                },

        SECOND
                {
                    @Override
                    int getValue()
                    {
                        return value;
                    }
                },

        THIRD
                {
                    @Override
                    int getValue()
                    {
                        return value;
                    }
                };

        int value;

        abstract int getValue();
    }
}
