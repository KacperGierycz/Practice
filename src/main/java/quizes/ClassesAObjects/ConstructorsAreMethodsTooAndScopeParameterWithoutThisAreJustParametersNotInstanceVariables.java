package quizes.ClassesAObjects;

public class ConstructorsAreMethodsTooAndScopeParameterWithoutThisAreJustParametersNotInstanceVariables {

        {
            s = "second";
        }

        String s = "first";

        {
            System.out.println(s);

            s = "third";
        }

        public ConstructorsAreMethodsTooAndScopeParameterWithoutThisAreJustParametersNotInstanceVariables()
        {
            System.out.println(s);
        }

        public ConstructorsAreMethodsTooAndScopeParameterWithoutThisAreJustParametersNotInstanceVariables(String s)
        {
            System.out.println(s);

            this.s = s;
        }


    }
