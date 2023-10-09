package quizes.interfaces;

public class HowAboutOneInsteadOfTwo {
    interface P
    {
        String p = "PPPP";

        String methodP();
    }

    interface Q extends P
    {
        String q = "QQQQ";

        String methodQ();
    }

    class R implements  Q
    {
        public String methodP()
        {
            return q+p;
        }

        public String methodQ()
        {
            return p+q;
        }
    }

    public class MainClass
    {

    }
    public static void main(String[] args)
    {
        R r = new HowAboutOneInsteadOfTwo(). new R();

        System.out.println(r.methodP());

        System.out.println(r.methodQ());
    }


}
