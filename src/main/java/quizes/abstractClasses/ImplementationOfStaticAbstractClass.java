package quizes.abstractClasses;

public class ImplementationOfStaticAbstractClass {

    class X
    {
        abstract static class Y
        {
            abstract void methodY();
        }
    }

    public static void main(String[] args) {

        X.Y y = new X.Y(){

            @Override
            void methodY() {
                System.out.println("With a little help from editor");
            }
        };
        y.methodY();



    }

    class Z extends X.Y{

        @Override
        void methodY() {
            System.out.println("Implementation of a static abstract class into child class");
        }


    }

}
