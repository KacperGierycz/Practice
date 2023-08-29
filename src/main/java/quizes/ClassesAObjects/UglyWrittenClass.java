package quizes.ClassesAObjects;

public class UglyWrittenClass {

        {
            System.out.println(1);

            id = 1001;
        }

        static
        {
            System.out.println(2);

            name = "NAME";
        }

        static String name;

        public UglyWrittenClass(String name, int id)
        {
            System.out.println(3);

            this.name = name;

            this.id = id;
        }

        int id;

        {
            System.out.println(4);

            System.out.println(id);
        }

        static
        {
            System.out.println(5);

            System.out.println(name);
        }

        public static void main(String[] args)
        {
            System.out.println(6);

            UglyWrittenClass a = new UglyWrittenClass("MyName", 1111);
        }


}
