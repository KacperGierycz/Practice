package character;

public class EscapeCharacter {

    Integer[] integers = new Integer[5];

    public static void main(String[] args) {
        System.out.println("She said \"Hello!\" to me.");

        String fs;
        Float floatVar = 100f;
        Integer intVar = 100;
        String stringVar = "100";
        fs = String.format("The value of the float " +
                        "variable is %f, while " +
                        "the value of the " +
                        "integer variable is %d, " +
                        " and the string is %s",
                floatVar, intVar, stringVar);
        System.out.println(fs);

    }
}
