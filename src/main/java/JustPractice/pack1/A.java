package JustPractice.pack1;


class A
{
    protected static String s = "A";
}

class B extends A
{

}

class C extends B
{
    void noStatMethod(){
        System.out.println(s);
    }
    static void methodOfC()
    {
        System.out.println(s);
    }
}

