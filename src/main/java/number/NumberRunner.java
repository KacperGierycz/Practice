package number;

public class NumberRunner {

    Integer x = 101;

    Integer getX(){

        return x;
    }



    public static void main(String[] args) {

        NumberRunner numberRunner = new NumberRunner();
        Integer xx = numberRunner.x;

        System.out.println(xx.hashCode());

        Float floatVar = 1f;

        int intVar = 2;

        String stringVar = "3";

        System.out.format("The value of " + "the float variable is " +
                "%f, while the value of the " + "integer variable is %d, " +
                "and the string is %s%n", floatVar, intVar, stringVar);

        int i = 461012;
        System.out.format("The value of i is: %d%n", i);
    }
}
