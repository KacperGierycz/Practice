package quizes.nestedClasses;

 class NoStaticInitializersInNestedClass {

        class B
        {
            {
                System.out.println(1);
            }

            static{
                System.out.println(2);
            }
        }

    public static void main(String[] args) {
        NoStaticInitializersInNestedClass.B b = new NoStaticInitializersInNestedClass().new B();
    }

}
