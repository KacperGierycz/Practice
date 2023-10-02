package quizes.interfaces;

public class VeryToxicAssignmentOperator {

    class A implements B
    {
        public int methodB(int i)
        {
            return i =+ i * i;
        }
    }

    interface B
    {
        int methodB(int i);
    }

    public class MainClass
    {

    }

    public static void main(String[] args)
    {
        B b = new VeryToxicAssignmentOperator(). new A();

        System.out.println(b.methodB(2));
    }

}
