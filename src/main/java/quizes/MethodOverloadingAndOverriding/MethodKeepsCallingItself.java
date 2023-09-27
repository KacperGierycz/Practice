package quizes.MethodOverloadingAndOverriding;

public class MethodKeepsCallingItself {

        double overloadedMethod(double d)
        {
            return d *= d;
        }

        int overloadedMethod(int i)
        {
            return overloadedMethod(i *= i);
        }

        float overloadedMethod(float f)
        {
            return overloadedMethod(f *= f);
        }

        public static void main(String[] args)
        {
            MethodKeepsCallingItself main = new MethodKeepsCallingItself();

            System.out.println(main.overloadedMethod(100));
        }


}
