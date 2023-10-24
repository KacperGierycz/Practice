package quizes.enums;

public class BlockIsShadowingVariableCanIAccessIt {

    enum MyEnums
    {
        X
                {
                    String ss = "X";
                },

        Y
                {
                    String ss = "Y";
                };

        String s = "MyEnums";

        String calculate(String s)
        {
            return this.s + s;
        }
    }


        public static void main(String[] args)
        {
            System.out.println(MyEnums.X.s);

            System.out.println(MyEnums.X.calculate("X"));

            System.out.println(MyEnums.Y.s);

            System.out.println(MyEnums.Y.calculate("Y"));
        }


}
