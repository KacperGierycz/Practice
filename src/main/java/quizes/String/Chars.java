package quizes.String;

public class Chars {

    public static void main(String[] args)
    {
        "ABC123abc".chars().forEach(e -> System.out.println(Character.toChars(e)));
    }

}
