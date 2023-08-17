package quizes.String;

public class EqualsInString {

    public static void main(String[] args) {

        String s1 = "Java";
        String s2 = new String("Java");
        System.out.println(s1.hashCode() == s2.hashCode());
        System.out.println(s1 == s2);

    }

}
