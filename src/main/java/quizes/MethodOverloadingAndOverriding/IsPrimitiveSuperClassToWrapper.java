package quizes.MethodOverloadingAndOverriding;

public class IsPrimitiveSuperClassToWrapper {

    class A
    {
        void methodOne(double D)
        {

        }

        int methodTwo(Integer I)
        {
            return I;
        }
    }

    class B extends A
    {
//        @Override
//        void methodOne(Double d)
//        {
//
//        }

        @Override
        int methodTwo(Integer I)
        {
            return (int)1.1;
        }
    }

}
