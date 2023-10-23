package quizes.enums;

public class WhyEnumCallsConstructorTwice {

    enum EnumOne
    {
        ONE;

        {
            System.out.println("ONE");
        }

        enum EnumTwo
        {
            TWO;

            {
                System.out.println("TWO");
            }

            enum EnumThree
            {
                THREE;

                {
                    System.out.println("THREE");
                }

            }

        }
    }

        public static void main(String[] args)
        {

            System.out.println(EnumOne.EnumTwo.EnumThree.THREE);

            System.out.println(EnumOne.EnumTwo.TWO);

            System.out.println(EnumOne.ONE);

        }


}
