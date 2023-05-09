package JustPractice;

class X
{
    static int x = 3131;

    static class Y
    {
        static int y = x++;

        static class Z
        {
            static int z = y++;
        }
    }

    class ABC
    {
        class XYZ
        {
            int i = 111;
        }
    }



    public static void main(String[] args)
    {
        X x = new X();

        ABC abc = x.new ABC();

        ABC.XYZ xyz = abc.new XYZ();
        xyz.i = 0;

        System.out.println(X.x);

        System.out.println(X.Y.y);


        System.out.println(X.Y.Z.z);
        System.out.println(X.Y.y);
        System.out.println(X.x);
    }
}
