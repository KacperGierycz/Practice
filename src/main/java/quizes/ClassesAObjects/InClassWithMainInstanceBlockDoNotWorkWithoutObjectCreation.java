package quizes.ClassesAObjects;

public class InClassWithMainInstanceBlockDoNotWorkWithoutObjectCreation {

        {
            System.out.println(1);
        }

        static
        {
            System.out.println(2);
        }

        public InClassWithMainInstanceBlockDoNotWorkWithoutObjectCreation(int i)
        {
            System.out.println(3);
        }

        public InClassWithMainInstanceBlockDoNotWorkWithoutObjectCreation()
        {
            System.out.println(4);
        }
    }

