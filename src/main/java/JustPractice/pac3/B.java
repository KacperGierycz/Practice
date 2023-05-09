package JustPractice.pac3;


import JustPractice.pack2.pack1.A;

class B extends A
{
public int methodTwo(int i) {
        return 1;
    }

    int methodOne(int i)
    {
        return methodTwo(++i);
    }
}

