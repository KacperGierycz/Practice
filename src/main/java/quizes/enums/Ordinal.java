package quizes.enums;

public class Ordinal {

    enum MyEnums
    {
        A
                {
                    @Override
                    void myEnumMethod()
                    {
                        System.out.println(ordinal());
                    }
                },

        B
                {
                    @Override
                    void myEnumMethod()
                    {
                        System.out.println(ordinal());
                    }
                },

        C
                {
                    @Override
                    void myEnumMethod()
                    {
                        System.out.println(ordinal());
                    }
                };

        abstract void myEnumMethod();
    }


        public static void main(String[] args)
        {
            MyEnums.A.myEnumMethod();

            MyEnums.B.myEnumMethod();

            MyEnums.C.myEnumMethod();
        }


}
