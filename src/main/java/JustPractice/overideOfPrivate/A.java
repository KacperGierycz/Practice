package JustPractice.overideOfPrivate;

public class A
{
    private int methodOne(int i)
    {
        return ++i;
    }

    public int methodTwo(int i)
    {
        return methodOne(++i);
    }

    public static void main(String[] args)
    {
        System.out.println(new B().methodOne(101));
    }
}


class B extends A
{

    int methodOne(int i)
    {
        return methodTwo(++i);
    }
}

