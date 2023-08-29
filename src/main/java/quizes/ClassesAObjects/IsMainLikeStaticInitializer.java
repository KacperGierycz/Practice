package quizes.ClassesAObjects;

public class IsMainLikeStaticInitializer {

        {
            System.out.println(1);
        }

        //take it and move after main??!
//        static
//        {
//            System.out.println(2);
//        }

        public IsMainLikeStaticInitializer()
        {
            System.out.println(3);
        }

        public static void main(String[] args)
        {
            System.out.println(4);

            IsMainLikeStaticInitializer a = new IsMainLikeStaticInitializer();
        }

    static
    {
        System.out.println(2);
    }


}
