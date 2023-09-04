package quizes.ClassesAObjects;

public class BeCarefulOfThisOrNoThisInMethods {

        {
            s = "second";
        }

        String s = "first";

        {
            System.out.println(s);

            s = "third";
        }

        public BeCarefulOfThisOrNoThisInMethods()
        {
            System.out.println(s);
        }

        public BeCarefulOfThisOrNoThisInMethods(String s)
        {
            System.out.println(s);

            this.s = s;
        }
    }

