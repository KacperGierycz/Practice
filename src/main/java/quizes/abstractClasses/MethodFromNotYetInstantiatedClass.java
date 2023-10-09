package quizes.abstractClasses;

public class MethodFromNotYetInstantiatedClass {

    abstract class XYZ
    {
        {
            System.out.println(1);
        }

        public XYZ()
        {
            System.out.println(2);

            abstractMethod();
        }

        abstract void abstractMethod();
    }

    class PQR extends XYZ
    {
        {
            System.out.println(3);
        }

        public PQR()
        {
            System.out.println(4);
        }

        @Override
        void abstractMethod()
        {
            System.out.println(5);
        }
    }

    public class MainClass
    {

    }

    public static void main(String[] args)
    {
        PQR pqr = new MethodFromNotYetInstantiatedClass(). new PQR();
    }

}
