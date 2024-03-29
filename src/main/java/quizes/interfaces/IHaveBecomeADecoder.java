package quizes.interfaces;

public class IHaveBecomeADecoder {

    interface ABC
    {
        void methodOne();
    }

    interface PQR extends ABC
    {
        void methodTwo();
    }

    abstract class XYZ implements PQR
    {
        public void methodOne()
        {
            methodTwo();
        }
    }

    class MNO extends XYZ
    {
        public void methodTwo()
        {
            methodOne();
        }
    }

    public class MainClass
    {
        public static void main(String[] args)
        {
            ABC abc = new IHaveBecomeADecoder(). new MNO();

            abc.methodOne();
        }
    }

}
