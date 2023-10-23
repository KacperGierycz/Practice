package quizes.enums;

public class PrivateConstructor {
    enum Enums
    {
        A, B, C;

        private Enums()
        {
            System.out.println(1);
        }
    }

    public static void main(String[] args)
    {
        Enum en = Enums.B;
        System.out.println(en);
    }

}
