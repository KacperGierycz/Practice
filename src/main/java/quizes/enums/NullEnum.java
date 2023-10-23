package quizes.enums;

public class NullEnum {

    enum MyEnums
    {
        FIRST, SECOND, THIRD, FOURTH;
    }

        public static void main(String[] args)
        {
            MyEnums[] myEnums = new MyEnums[4];

            for (int i = 0; i < myEnums.length; i++)
            {
                System.out.println(myEnums[i]);
            }
        }


}
