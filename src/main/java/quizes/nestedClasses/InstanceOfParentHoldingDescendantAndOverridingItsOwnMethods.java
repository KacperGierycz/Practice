package quizes.nestedClasses;

public class InstanceOfParentHoldingDescendantAndOverridingItsOwnMethods {

        static class InnerClassOne
        {
            int i = 1221;

            int getI()
            {
                return i = i++ - ++i;
            }
        }

        static class InnerClassTwo extends InnerClassOne
        {
            @Override
            int getI()
            {
                return i = i-- + --i;
            }
        }


    }
