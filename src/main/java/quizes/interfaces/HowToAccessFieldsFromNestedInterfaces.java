package quizes.interfaces;

public class HowToAccessFieldsFromNestedInterfaces {

    interface One
    {
        int i = 222;

        interface OneTwo
        {
            int i = One.i+One.i;

            interface OneTwoThree
            {
                int i = OneTwo.i + OneTwo.i;
            }
        }
    }

    public static void main(String[] args) {

       int k= One.OneTwo.OneTwoThree.i;


    }

}
