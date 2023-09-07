package quizes.inheritance;

public class InstanceVariableInStaticMethod {

        int i = 101010;

        public InstanceVariableInStaticMethod()
        {
            i = i++ + i-- - i;
            System.out.println(i);
        }

        static int staticMethod(int i)
        {
            return --i;
        }
    }

    class InstanceVariableInStaticMethod2 extends InstanceVariableInStaticMethod
    {
        public InstanceVariableInStaticMethod2()
        {
            System.out.println(staticMethod(i));
        }
    }

