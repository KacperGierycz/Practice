package quizes.String;

public class InternMoreComplexAndToComplex {

    public static void main(String[] args)
    {
        String s1 = new String("JAVA");

        String s2 = new String("JAVA");

        System.out.println(s1 == s2);

        System.out.println(s1.equals(s2));

        System.out.println(s1 == s2.intern());

        // why is that so?
        System.out.println(s1.intern() == s2.intern());

        System.out.println(s1.intern() == s2);
    }

        }
