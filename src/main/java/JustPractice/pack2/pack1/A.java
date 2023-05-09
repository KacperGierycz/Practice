package JustPractice.pack2.pack1;

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
}